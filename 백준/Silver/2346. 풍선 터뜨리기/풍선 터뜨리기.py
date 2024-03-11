from collections import deque
n = int(input())

q = deque(enumerate(map(int,input().split())))

result = []
while len(q) != 1:
    first_val = q.popleft()
    result.append(first_val[0]+1)
    if first_val[1] > 0:
        for _ in range(first_val[1]-1):
            q.append(q.popleft())
    else:
        for _ in range(-first_val[1]):
            q.appendleft(q.pop())

result.append(q.pop()[0]+1)
print(*result)