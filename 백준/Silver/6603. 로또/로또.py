import sys
a = []
k = 6

def recur(index,s):
	if len(a)==k:
		print(" ".join(map(str,a)))
		return

	for i in range(index, len(s)):
		a.append(s[i])
		recur(i+1,s)
		a.pop()

while True:
	s = list(map(int,sys.stdin.readline().split(' ')))
	if s[0] == 0:
		break
	s.pop(0)
	recur(0,s)
	print()

