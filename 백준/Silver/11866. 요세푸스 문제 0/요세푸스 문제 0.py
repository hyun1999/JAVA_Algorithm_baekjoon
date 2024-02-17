from collections import deque
n,k = map(int,input().split())
q = deque()
for i in range(1,n+1):
    q.append(i)
result = []
while len(q)>=1:
    for j in range(k-1):
        q.append(q.popleft())
    result.append(q.popleft())
print('<',end='')
for i in range(n-1):
    print(result[i],end=', ')
print(result[n-1],'>',sep='')
