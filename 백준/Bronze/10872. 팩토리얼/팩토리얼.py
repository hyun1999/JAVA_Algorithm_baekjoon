total = 1
n = int(input())
for i in range(n):
    total*=(i+1)
if n == 0:
    print(1)
else:
    print(total)