import sys
n = int(input())
dic = {}
input_key_list = list(map(int,sys.stdin.readline().split()))
for i in input_key_list:
    if i in dic:
        dic[i] = dic[i]+1
    else :
        dic[i] = 1
m = int(input())
arr = list(map(int,sys.stdin.readline().split()))
for i in arr:
    if i not in dic:
        print(0,end=' ')
    else:
        print(dic[i],end=' ')