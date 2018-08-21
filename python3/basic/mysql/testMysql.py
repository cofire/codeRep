import pymysql

# 安装
# pip install pymysql

# 连接mysql
conn = pymysql.connect(host='127.0.0.1', user='root',
                       passwd='root', db='testdb')

# 获取游标
cur = conn.cursor()

try:
    # 使用execute执行sql语句
    reCount = cur.execute('select * from one;')
    # reCount = cur.execute('insert into users(name,age,sex) values(%s,%s,%s)', ('momo', '13','male'))
    # reCount = cur.execute('insert into users(name,age,sex) values(%(age)s, %(name)s, %(sex)s)',{'sex':'female,'name':'pig','age':10})

    # 使用fetchone 获取一条数据
    data = cur.fetchone()

    # 使用fetchall 获取所有数据
    #data = cur.fetchall()

    # 提交命令
    conn.commit()
except:
    # 发生错误回滚
    conn.rollback()

# 关闭游标
cur.close()

# 关闭数据库连接
conn.close()

print(reCount)
print(data)
