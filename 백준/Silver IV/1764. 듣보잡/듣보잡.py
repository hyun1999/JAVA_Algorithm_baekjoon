import sys

n,m = map(int,input().split())
dic = {}
for i in range(n):
    input_val = sys.stdin.readline().rstrip()
    dic[input_val] = True
arr = []
count = 0
for i in range(m):
    input_val = sys.stdin.readline().rstrip()
    if input_val in dic:
        arr.append(input_val)
        count+=1
arr.sort()
print(count)
for i in arr:
    print(i)