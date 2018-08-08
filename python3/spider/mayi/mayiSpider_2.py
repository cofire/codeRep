#!/user/bin python
# -*- coding:utf-8 -*- 
'''
 @Title:       爬取蚂蚁网上的小说
 @Author:      ly
 @DateTime:    2017-08-24 09:33:20
 @Description: 获取分类下面的小说标题和链接 
 @Version:     1.0 
'''


import urllib.request,re,time,random,gzip

# 定义保存文件函数
def saveFile(data,path,title):
    path = str(path)+str(title)+".txt"
    file = open(path,'a')
    # 将数据写入文件
    for d in data:
        d = str(d) + '\n'
        file.write(d)
    file.close

# 数据解压缩
def ungzip(data):
    try:
        data = gzip.decompress(data)
    except:
        print("未经压缩，无需解压...")
    return data

# 数据清洗
def cleanData(data):
    data = data.replace('\xa0','')
    data = data.replace('\t','')
    data = data.replace('&amp;','')
    data = data.replace('amp;','')
    data = data.replace('quot;','')
    # data = data.replace('quot;','')
    return data

class MaYiSpider:
    def __init__(self,url):
        self.url = url
        self.headers = {
            "Connection": "keep-alive",  
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36"  
                          "(KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36", 
            "Cache-Control":" max-age=0 ",
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",  
            "Accept-Encoding": "gzip, deflate, sdch",  
            "Accept-Language": "zh-CN,zh;q=0.8,zh-TW;q=0.6,en;q=0.4",  
            "Host": "mayi01.xyz"
        }

    # 总页数
    def getPages(self):
        pass

    #设置要抓取的页面
    def setPage(self,idx):
        pass

    # 拼接所需要爬取的url
    def getUrl(self,classification,pageIdx):
        url = self.url + "list_" + str(classification) +"_" + str(pageIdx) +".html"
        return url

    # 读取页面信息
    def readClassData(self,url):
        # url = self.url + url
        print(url)
        ret = []
        # 抓取数据的正则表达式
        str = r'<div.*?novelList">(.*?)</a></div>'
        str2 = r'<a href="(.*?)".*?<div.*?pull-left">(.*?)</div>'
        req = urllib.request.Request(url=url, headers=self.headers)
        res = urllib.request.urlopen(req)

        # 数据读取解压
        data = res.read()
        data = ungzip(data)
        # data = data.decode('GBK','ignore')
        data = data.decode('utf-8','ignore')
        # data = data.replace('\xa0','')
        data = cleanData(data)
        pattern = re.compile(str,re.DOTALL)
        items = re.findall(pattern,data)
        sourceData = items[0]
        # print(sourceData)
        pattern2 = re.compile(str2,re.DOTALL)
        items = re.findall(pattern2,sourceData)
        # print(items)
        # for item in items:
        #     ret.append(item[0]+'\t'+item[1])
        return items

    # 爬取小说内容
    def readContent(self,url):
        print(url)
        ret = []
         # 抓取数据的正则表达式
        # str = r'<div.*?novelContent">(.*?)</div>'
        str = r'<input.*?value="(.*?)">'
        req = urllib.request.Request(url=url, headers=self.headers)
        res = urllib.request.urlopen(req)

        # 数据读取解压
        data = res.read()
        data = ungzip(data)
        data = data.decode('utf-8','ignore')
        # data = data.replace('\xa0','')
        data = cleanData(data)
        pattern = re.compile(str,re.DOTALL)
        items = re.findall(pattern,data)
        for item in items:
            ret.append(item)
        return ret

# 定义爬取的网址
basicUrl = 'http://mayi01.xyz/'
# 定义保存文件的路径
path = './save/novel/17/'
title = '女同学校花'
# 定义爬虫对象
mayi01 = MaYiSpider(basicUrl)
# 定义小说分裂ID
classification = 17
# 先获取当前页面小说的标题和链接，然后访问链接，爬取小说的内容
for pageIdx in range(0,1):
    # 要爬取的当前页面url
    url = mayi01.getUrl(classification,pageIdx)
    items = mayi01.readClassData(url)
    i=0
    for item in items:
        time.sleep(1)
        print(time.time())
        i = i+1
        if i%10 == 0:
            print(time.time())
            time.sleep(10)
        novelUrl = basicUrl + item[0]
        data = mayi01.readContent(novelUrl)
        title = item[1]
        saveFile(data,path,title)
        break




