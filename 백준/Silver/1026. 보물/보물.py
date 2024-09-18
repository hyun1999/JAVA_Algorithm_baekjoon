N = int(input())
As = list(map(int,input().split(" ")))
Bs = list(map(int,input().split(" ")))

total = 0
As = sorted(As, key = lambda x:-x)
Bs = sorted(Bs)
for i in range(N):
	total += As[i]*Bs[i]
print(total)