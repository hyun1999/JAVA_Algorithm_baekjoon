import sys
n = int(input())
dic = {}
for i in range(n):
    name, state = map(str,sys.stdin.readline().split())
    dic[name] = state
dic_result = {}
for key,value in dic.items():
    if value == 'enter':
        dic_result[key] = 'enter'
sorted_result = sorted(dic_result,reverse=True)
for i in sorted_result:
    print(i)