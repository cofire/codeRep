#!/usr/bin/env python3
# -*- coding:UTF-8 -*-
'''
 @Title:       Title
 @Author:      ly
 @DateTime:    2018-07-16 15:46:31
 @Description: Description 
 @Version:     1.0 
'''
from urllib import request

if __name__ == "__main__":
    response = request.urlopen("http://fanyi.baidu.com")
    html = response.read()
    html = html.decode("utf-8")
    print(html)