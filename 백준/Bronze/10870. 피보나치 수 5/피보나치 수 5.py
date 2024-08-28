def recursion(n):
	if n==0:
		return 0
	elif n==1:
		return 1
	elif n==2:
		return 1
	return recursion(n-2)+recursion(n-1)
print(recursion(int(input())))