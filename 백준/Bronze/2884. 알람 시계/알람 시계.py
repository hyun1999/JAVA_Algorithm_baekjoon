import sys
hour,minuite = map(int,sys.stdin.readline().split())
total = hour * 60 + minuite - 45
if total < 0:
	total = total + (24 * 60)
	print(total//60,total%60)
else:
	print(total//60,total%60)