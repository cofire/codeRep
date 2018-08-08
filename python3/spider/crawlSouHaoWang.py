#!/user/bin python
# -*- coding:utf-8 -*- 
'''
 @Title:       爬取搜号网上所有城市的手机号
 @Author:      ly
 @DateTime:    2017-08-23 13:31:19
 @Description: 在前一次的基础上进行修改，进而爬取整个网站的信息 
 @Version:     1.0 
'''

import urllib.request,re,time,random,gzip

# 定义保存文件函数
def saveFile(data,path,title):
    path = str(path)+str(title)+".txt"
    file = open(path,'a')
    # page = '营业商'+'\t'+"手机号"+'\t'+'卡费'+'\t'+'话费'+'\n'
    # file.write(page)
    # 将手机号信息写入文件
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

class SouHaoWangSpider:
    def __init__(self,url,CityId=1,pageIdx=1,action="cardlist",classid=0,ctype=0,clist=0,key="eyJqcSI6IiIsIm1oIjoiIiwiaXNtdyI6MCwiaGQiOiIwIiwicHJpY2UiOiIwIiwiZ3oiOiIwIiwid3MiOiIwIiwic3IiOiIwIiwibnVtIjoiMTAiLCJ0ZCI6IjEwIiwiangiOiI5OTkiLCJubyI6IjIiLCJ5eXMiOiIwIn0="):
        # 默认当前页
        self.pageIdx = pageIdx
        self.CityId = CityId
        self.action = action
        self.classid = classid
        self.ctype = ctype
        self.clist = clist
        self.key = key
        self.url = url+"?"+"action="+self.action+"&classid="+str(self.classid)+"&ctype="+str(self.ctype)+"&clist="+str(self.clist)+"&key="+self.key
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
        print("getPages:",self.url)
        strlist = self.url.split('?')
        url = strlist[0]+"?CityId="+str(self.CityId)
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
        url = self.url + "&page=" + str(idx) + "&CityId=" + self.CityId
        # print(self.url)
        return url

    # 读取城市信息
    def getCity(self,cityId):
        strlist = self.url.split('?')
        url = strlist[0]+"?CityId="+str(cityId)
        # print(cityId)
        self.CityId = str(cityId)
        url = url[0:url.rfind('=') + 1] + str(cityId) 
        # print(url)
        req = urllib.request.Request(url=url,headers=self.headers)
        res = urllib.request.urlopen(req)
        # print("url",self.url)
        # 数据解压
        data = res.read()
        data = ungzip(data)
        data = data.decode('utf-8')
        # print(data)
        pages = r'<div.*?menu1">(.*?)</div>'
        pattern = re.compile(pages,re.DOTALL)
        cityName = re.findall(pattern,data)[0]
        print(cityName)
        print("当前城市：%s"%(cityName))
        return cityName

    # 读取页面信息
    def readData(self,url):
        ret = []
        # 抓取数据的正则表达式
        str = r'<li><div.*?<div.*?address">(.*?)</div>.*?<span>(.*?)</span>.*?'+\
              r'<samp>(.*?)</samp>.*?<a href=".*?cnum=(.*?)".*?>'
        req = urllib.request.Request(url=url, headers=self.headers)
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
            ret.append(item[0]+'\t'+item[3]+'\t'+item[1]+'\t'+item[2])
        return ret

# 定义爬取的网址
url = 'http://www.souhaowang.com/aspx/sjhw/cardlist.aspx'
# 定义保存文件的路径
path = './save/soHaoWang/all/'
# 定义爬虫对象
shw = SouHaoWangSpider(url)
# 定义爬取的城市总数
cityNum = 2
# 爬取手机号信息
for cx in range(1,cityNum+1):
    title = shw.getCity(cx)
    # 编号为cx的城市的号码总页数
    pagesNum = int(shw.getPages())
    for idx in range(1,pagesNum+1):
        urlTemp = shw.setPage(idx)
        print("CityId:%d  page:%d"%(cx,idx))
        papers = shw.readData(urlTemp)
        saveFile(papers,path,title)

