#!/usr/bin/python
# -*- coding:UTF-8 -*-
'''
 @Title:       设置excel单元格格式
 @Author:      ly
 @DateTime:    2018-04-23 16:51:42
 @Description: Description 
 @Version:     1.0 
'''

from random import sample
import openpyxl
from openpyxl.styles import Font, colors

def batchFormat(fileName):
    fn = fileName + '.xlsx'
    wb = openpyxl.load_workbook(fn)
    ws = wb.worksheets[0]
    for irow, row in enumerate(ws.rows, start=1):
        for cell in row:
            # 偶数行添加背景填充色，从红到蓝渐变
            if irow%2 == 0:
                cell.fill = openpyxl.styles.fills.Color('FF0000')
    wb.save('new'+fn)

batchFormat('0')