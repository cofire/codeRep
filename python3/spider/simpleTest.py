'''
/**
 * @Title:       简单网页爬虫---爬取https://www.douban.com/
 * @Description: Description
 * @author:      ly
 * @aateTime:    2017-08-22 10:57:35
 * @param:       https://www.douban.com/
 * @return       
 */
'''

import urllib.request

# 网址
url='https://www.douban.com/'

# 请求
request = urllib.request.Request(url)

# 爬取结果
response = urllib.request.urlopen(request)

data = response.read()

# 设置编码格式
data = data.decode('utf-8')

# 打印结果
print (data)

# 打印爬取网页的各种信息
print(type(response))
print(response.geturl())
print(response.info())
print(response.getcode())