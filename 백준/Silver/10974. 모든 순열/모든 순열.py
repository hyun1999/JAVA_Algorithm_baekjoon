import sys
n = int(sys.stdin.readline().rstrip())

# 현재 배열
ing = []

def isDuplicate(input_val):
	if input_val in ing:
		return True
	else:
		return False

def recur():
	if len(ing) == n:
		print(' '.join(map(str,ing)))
		return

	for i in range(1,n+1):
		if isDuplicate(i):
			continue
		ing.append(i)
		recur()
		ing.pop()

recur()

