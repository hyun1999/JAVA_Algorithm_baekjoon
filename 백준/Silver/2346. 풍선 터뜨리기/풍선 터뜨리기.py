from collections import deque
n = int(input())
q = deque()
arr = list(map(int,input().split()))
index = 1
result = []
for i in arr:
    q.append([i,index])
    index+=1
#입력 완료

pung = q[0][0]
result.append(q[0][1])
q.popleft()
for _ in range(n-1):
    if pung > 0:
        for _ in range(pung-1):
            q.append(q.popleft())
        result.append(q[0][1])
        pung = q[0][0]
        q.popleft()
    else:
        for _ in range(-pung):
            q.appendleft(q.pop())
        result.append(q[0][1])
        pung = q[0][0]
        q.popleft()
for i in result:
    print(i,end=' ')