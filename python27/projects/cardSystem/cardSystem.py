#!/usr/bin/python
# -*- coding:UTF-8 -*-
'''
 @Title:       Title
 @Author:      ly
 @DateTime:    2018-01-22 11:14:33
 @Description: Description 
 @Version:     1.0 
'''

import sys

# 用来存储名片
card_infors = []

# 打印菜单
def print_menu():
    print "="*50
    print u"   名片管理系统 v1.0"
    print u"1. 添加一个新名片"
    print u"2. 删除一个名片"
    print u"3. 修改一个名片"
    print u"4. 查询一个名片"
    print u"5. 显示所有名片"
    print u"6. 退出系统"
    print "="*50

# 添加一个新名片
def add_new_card_infor():

    new_name = raw_input(u'请输入名字：'.encode('gb18030'))
    new_phone = raw_input(u'请输入手机号：'.encode('gb18030'))

    new_infor = {}
    new_infor["name"] =  new_name
    new_infor["phone"] = new_phone

    global card_infors
    card_infors.append(new_infor)

    print card_infors

# 删除名片
def delete_infor():
    global card_infors
    delete_name = raw_input(u'请输入要删除的人姓名:'.encode('gb18030'))
    delete_flag = 0
    for temp in card_infors:
        if temp['name'] == delete_name:
            card_infors.remove(temp)
            delete_flag += 1
    if delete_flag == 0:
        print u'查无此人'
    else:
        print u"--------删除了%d条记录--------" %(delete_flag+1)

# 修改名片信息
def modify_infor():
    global card_infors
    modify_name = raw_input(u'请输入要修改的人姓名'.encode('gb18030'))

    for temp in card_infors:
        if temp['name'] == modify_name:
            temp['name'] = raw_input(u'请输入新名字：'.encode('gb18030'))
            temp['phone'] = raw_input(u'请输入新手机号：'.encode('gb18030'))
            print u'修改完毕'
            return
        print u'查无此人'

# 查询名片信息
def find_infor():
    global card_infors
    find_name = raw_input(u'请输入需要查询的人姓名：'.encode('gb18030'))
    find_flag = 0
    for temp in card_infors:
        if temp['name'] == find_name:
            print u"姓名：%s\t手机号：%s" %(temp['name'],temp['phone'])
            find_flag = 1
            break
    if find_flag == 0:
        print u'查无此人'

# 显示所有信息
def show_all_infors():
    global card_infors
    if len(card_infors) == 0:
        print u'暂无信息'
        return
    else:
        print u'姓名\t手机号'
        for temp in card_infors:
            print u"姓名：%s\t手机号：%s" %(temp['name'],temp['phone'])

# 主体，对整个模块的额调用
def main():
    print_menu()

    while True:
        # 获取用户输入
        num = raw_input(u'请输入选择：'.encode('gb18030'))
        if num == 1:
            add_new_card_infor()
        elif num ==2:
            delete_infor()
        elif num == 3:
            modify_infor()
        elif num == 4:
            find_infor()
        elif num == 5:
            show_all_infors()
        elif num == 6:
            break
        else:
            print u"输入有误，请重新输入："

main()