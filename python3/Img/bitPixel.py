from PIL import Image
import xlsxwriter,xlwt

# 真彩色
def getHex(pixel):
    R = str(hex(pixel[0]))[2:]
    G = str(hex(pixel[1]))[2:]
    B = str(hex(pixel[2]))[2:]
    # 补0 
    R = hexAddZero(R)
    G = hexAddZero(G)
    B = hexAddZero(B)
    return R + G + B

# 两个字节
def getHexOnTwoBit(pixel):
    R = str(hex(pixel[0]))[2:]
    G = str(hex(pixel[0]))[2:]
    B = str(hex(pixel[0]))[2:]
    # 补0 
    R = hexAddZero(R)
    G = hexAddZero(G)
    B = hexAddZero(B)
    return R + G + B

# 黑白二色
def getHexOnOneBit(pixel):
    R = str(hex(pixel))[2:]
    G = str(hex(pixel))[2:]
    B = str(hex(pixel))[2:]
    # 补0 
    R = hexAddZero(R)
    G = hexAddZero(G)
    B = hexAddZero(B)
    return R + G + B

# 16进制补0
def hexAddZero(hexStr):
    if len(hexStr) != 2:
        hexStr = '0' + hexStr
    return hexStr

name = "yatou.jpg"
imgPath = "imgs/"
excelPath = "excels/"

img=Image.open(imgPath + name)
width = img.width
height = img.height

# 判断图片是否旋转过
RollType = True

# img_array["列",行]
img_array=img.load()
# print(type(img_array[1,1]))
# print(img_array[1,1])
# exit()
wbk = xlsxwriter.Workbook(excelPath + name + '.xls')
sheet = wbk.add_worksheet('sheet 1')
sheet.set_column('A:A',4)#设置第一列宽度为4像素
sheet.set_row(0,4)#设置第一列高度为4像素

RGBStr = ""
for i in range(0,width):
    for j in range(0,height):
        if isinstance(img_array[i,j],int):
            RGBStr = getHexOnOneBit(img_array[i,j])
        else:
            digit = len(img_array[i,j])
            if digit == 1:
                RGBStr = getHexOnOneBit(img_array[i,j])
            elif digit == 2:
                RGBStr = getHexOnTwoBit(img_array[i,j])
            else:
                RGBStr = getHex(img_array[i,j])
        # RGBStr = getHexOnOneBit(img_array[i,j])
        if RollType:
            sheet.write(i,j,"",wbk.add_format({'bg_color': RGBStr}))
        else:
            sheet.write(j,i,"",wbk.add_format({'bg_color': RGBStr}))

wbk.close()