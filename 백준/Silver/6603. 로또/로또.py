from itertools import combinations
import sys

while True:
	a = list(map(int,sys.stdin.readline().split(' ')))
	if a[0] == 0:
		break

	s = a[1:]
	comb = list(combinations(s,6))
	for i in comb:
		print(" ".join(map(str,i)))
	print()