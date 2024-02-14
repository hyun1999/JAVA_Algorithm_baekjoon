import sys
n,m = map(int,sys.stdin.readline().split())
set_s = {}
for _ in range(n):
    set_s[sys.stdin.readline()] = True
result = 0
for _ in range(m):
    if sys.stdin.readline() in set_s:
        result+=1
print(result)