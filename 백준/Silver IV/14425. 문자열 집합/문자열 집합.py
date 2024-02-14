import sys
n,m = map(int,sys.stdin.readline().split())
list_s = []
for _ in range(n):
    list_s.append(sys.stdin.readline())
result = 0
for _ in range(m):
    if sys.stdin.readline() in list_s:
        result+=1
print(result)