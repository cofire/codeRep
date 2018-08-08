'''
/**
 * @Title:       批量下载豆瓣首页的图片
 * @Description: 采用伪装浏览器的方式爬取豆瓣网站首页的图片，保存到指定路径文件夹下 
 * @author:      ly
 * @aateTime:    2017-08-22 12:26:25
 * @param:       
 * @return       
 */
'''

# 导入所需要的库
import urllib.request,socket,re,sys,os

# 定义图片保存的路径
targetPath = 'C:\\liying\\repository\\python\\spider\\save\\img'

def saveFile(path):
    # 检测当前路径的有效性
    if not os.path.isdir(targetPath):
        os.makedir(targetPath)

    # 设置每个图片的路径
    pos = path.rindex('/')
    t = os.path.join(targetPath,path[pos+1:])
    return t

# 用if __name__ == '__main__'来判断是否在直接运行该.py文件

# 网址
url = 'https://www.douban.com/'

# header 在网页中直接抓取
headers = {'User-Agent':'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) '  
                        'Chrome/51.0.2704.63 Safari/537.36'}

# 请求
req = urllib.request.Request(url=url,headers=headers)

# 爬取结果
res = urllib.request.urlopen(req)

data = res.read()

tmp = re.findall

print(data)

for link,t in set(re.findall(r'(https:[^s]*?(jpg|png|gif))',str(data))):
    print(link)
    try:
        urllib.request.urlretrieve(link,saveFile(link))
    except Exception as e:
        print("失败")

