import sys
value = int(sys.stdin.readline().rstrip())
sum = 0
for i in range(1,value+1):
	sum += i
print(sum)