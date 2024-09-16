from itertools import combinations

while True:
	arr = list(map(int,input().split(" ")))
	if arr[0] == 0:
		break
	result = combinations(arr[1:],6)
	for i in result:
		print(" ".join(map(str,i)))
	print()