import csv
import pymysql
f = csv.reader(open("D://DeskTop//Disease.csv", "r", encoding="utf-8"))
for i in f:
    a = i[0]
    b = i[1]
    c = i[2]
    if "疾病" in a:
        type = "疾病"
        a = a.replace("[疾病]", "")
    if "症状" in a:
        type = "症状"
        a = a.replace("[症状]", "")
    print(type)

    print("\n")

    print(a)
    print("\n")
    print(b)
    print("\n")
    print(c)
    print("\n")

    break
