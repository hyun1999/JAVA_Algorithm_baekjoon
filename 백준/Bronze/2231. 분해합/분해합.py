n = int(input())
for i in range(n):
    a = []
    for j in str(i):
        a.append(int(j))
    if i+sum(a) == n:
        print(i)
        break
    if i == n-1:
        print(0)