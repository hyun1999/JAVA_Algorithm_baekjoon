def recursion(n):
	global arr

	if arr[n]==-1:
		arr[n] = recursion(n-2)+recursion(n-1)
		return arr[n]
	else:
		return arr[n]

n = int(input())
arr = [-1] * (n+3)
arr[0] = 0
arr[1] = 1

print(recursion(n))