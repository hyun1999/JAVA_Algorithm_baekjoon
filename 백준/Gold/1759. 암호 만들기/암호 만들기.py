import sys
L,C = map(int,sys.stdin.readline().rstrip().split(" "))
s = sys.stdin.readline().rstrip().split(" ")

mo = {'a','e','i','o','u'}
s = sorted(s)
ing = []

def jamo(ing):
	ja_cnt = 0
	mo_cnt = 0
	for word in ing:
		if word in mo:
			mo_cnt +=1
		else:
			ja_cnt+=1
	return mo_cnt>=1 and ja_cnt>=2

def recur(index,start):
	if index == L:
		if jamo(ing):
			print(''.join(ing))
		return

	for i in range(start,C):
		ing.append(s[i])
		recur(index+1,i+1)
		ing.pop()

recur(0,0)