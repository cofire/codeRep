#!/user/bin python
# -*- coding:utf-8 -*- 
'''
 @Title:       爬取蚂蚁网上的小说
 @Author:      ly
 @DateTime:    2017-08-23 13:31:19
 @Description: 获取小说分类
 @Version:     1.0 
'''

import urllib.request,re,time,random,gzip

# 定义保存文件函数
def saveClass(data,path,title):
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

    # 读取页面信息
    def readClassData(self,url):
        print(url)
        ret = []
        # 抓取数据的正则表达式
        str = r'<div.*?"list"><h3>成人短篇</h3>(.*?)</div>'
        str2 = r'<a href="(.*?)">(.*?)</a>'
        req = urllib.request.Request(url=url, headers=self.headers)
        res = urllib.request.urlopen(req)

        # 数据读取解压
        data = res.read()
        data = ungzip(data)
        data = data.decode('utf-8')
        pattern = re.compile(str,re.DOTALL)
        items = re.findall(pattern,data)
        sourceData = items[0]
        pattern2 = re.compile(str2,re.DOTALL)
        items = re.findall(pattern2,sourceData)
        del items[0]
        print(items)
        for item in items:
            ret.append(item[0]+'\t'+item[1])
        return ret

# 定义爬取的网址
url = 'http://mayi01.xyz/'
# 定义保存文件的路径
path = './save/'
# 定义保存的文件名
title = 'classification'
# 定义爬虫对象
mayi01 = MaYiSpider(url)

papers = mayi01.readClassData(url)

saveClass(papers,path,title)




