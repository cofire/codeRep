#!/user/bin python
# -*- coding:utf-8 -*- 
'''
 @Title:       爬取搜号网上上海市所有的手机号
 @Author:      ly
 @DateTime:    2017-08-23 10:02:53
 @Description: Description 
 @version:     1.0
'''

import urllib.request,re,time,random,gzip

# 定义保存文件函数
def saveFile(data,i):
    path = "./save/soHaoWang/ShangHai/paper_"+str(i)+".txt"
    file = open(path,'wb')
    page = '当前页：'+str(i)+'\n'
    file.write(page.encode('gbk'))
    # file.write(page)
    # 将手机号信息写入文件
    for d in data:
        d = str(d) + '\n'
        file.write(d.encode('gbk'))
        # file.write(d)
    file.close

# 数据解压缩
def ungzip(data):
    try:
        data = gzip.decompress(data)
    except:
        print("未经压缩，无需解压...")
    return data

class SouHaoWangSpider:
    def __init__(self,url,pageIdx=1):
        # 默认当前页
        self.pageIdx = pageIdx
        self.url = url + "&page=" + str(pageIdx)
        self.headers = {
            "Connection": "keep-alive",  
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 "  
                          "(KHTML, like Gecko) Chrome/51.0.2704.63 Safari/537.36",  
            "Accept": "*/*",  
            "Accept-Encoding": "gzip, deflate",  
            "Accept-Language": "zh-CN,zh;q=0.8,en;q=0.6",  
            "Host": "www.souhaowang.com"
        }

    # 总页数
    def getPages(self):
        req = urllib.request.Request(url=self.url,headers=self.headers)
        res = urllib.request.urlopen(req)
        # print("url",self.url)
        # 数据解压
        data = res.read()
        data = ungzip(data)
        data = data.decode('utf-8')
        # print(data)
        pages = r'<div.*?page"><span.*?"page_l">.*?\/(.*?)</span>'
        pattern = re.compile(pages,re.DOTALL)
        pagesNum = re.findall(pattern,data)[0]
        print("总共%s页。"%(pagesNum))
        return pagesNum

    #设置要抓取的页面
    def setPage(self,idx):
        self.url = url + "&page=" + str(idx)
        print(self.url)

    # 读取页面信息
    def readData(self):
        ret = []
        # 抓取数据的正则表达式
        str = r'<li><div.*?<div.*?address">(.*?)</div>.*?<span>(.*?)</span>.*?'+\
              r'<samp>(.*?)</samp>.*?<a href=".*?cnum=(.*?)".*?>'
        req = urllib.request.Request(url=self.url, headers=self.headers)
        res = urllib.request.urlopen(req)

        # 数据读取解压
        data = res.read()
        data = ungzip(data)
        data = data.decode('utf-8')
        # print(data)
        pattern = re.compile(str,re.DOTALL)
        items = re.findall(pattern,data)
        items = list(set(items))
        # print(items)
        for item in items:
            ret.append(item[0]+'\t'+item[3]+'\n'+'卡费：'+item[1]+'\t'+'话费:'+item[2])
        return ret;

# 定义爬虫对象
url = 'http://www.souhaowang.com/aspx/sjhw/cardlist.aspx?classid=0&ctype=0&CityId=73&action=cardlist&clist=0&key=eyJqcSI6IiIsIm1oIjoiIiwiaXNtdyI6MCwiaGQiOiIwIiwicHJpY2UiOiIwIiwiZ3oiOiIwIiwid3MiOiIwIiwic3IiOiIwIiwibnVtIjoiMTAiLCJ0ZCI6IjEwIiwiangiOiI5OTkiLCJubyI6IjIiLCJ5eXMiOiIwIn0='
shw = SouHaoWangSpider(url)

#总页数
pagesNum = int(shw.getPages())
for idx in range(1,pagesNum+1):
    shw.setPage(idx)
    print("当前页",idx)
    papers = shw.readData()
    saveFile(papers,idx)

