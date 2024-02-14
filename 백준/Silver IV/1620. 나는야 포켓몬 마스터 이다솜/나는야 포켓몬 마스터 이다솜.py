import sys
n,m = map(int,sys.stdin.readline().split())

dic = {}
for i in range(1,n+1):
    input_val = sys.stdin.readline().rstrip()
    dic[input_val] = i
    dic[str(i)] = input_val
for i in range(m):
    input_val = sys.stdin.readline().rstrip()
    print(dic[input_val])