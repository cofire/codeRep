# -*- coding: UTF-8 -*-
from urllib import request
import io
import sys

sys.stdout = io.TextIOWrapper(sys.stdout.buffer,encoding='gb2312') #改变标准输出的默认编码

if __name__ == "__main__":
    #访问网址
    url = 'http://www.ip138.com/'
    #这是代理IP
    proxy = {'http':'219.141.153.41:80'}
    #创建ProxyHandler
    proxy_support = request.ProxyHandler(proxy)
    #创建Opener
    opener = request.build_opener(proxy_support)
    #添加User Angent
    opener.addheaders = [('User-Agent','Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36')]
    #安装OPener
    request.install_opener(opener)
    #使用自己安装好的Opener
    response = request.urlopen(url)
    #读取相应信息并解码
    html = response.read()
    # html = response.read().decode("gb2312")
    #打印信息
    print(html)