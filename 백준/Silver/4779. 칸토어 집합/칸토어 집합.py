import sys

def recursion(arr,start,length):
	if length<1:
		return arr

	mid_start = start+length
	mid_end = start+2*length
	arr[mid_start:mid_end] = [''] * length
	recursion(arr, start, length//3)
	recursion(arr, mid_end,length//3)
	
while(1):
	val = sys.stdin.readline().rstrip()
	if val == "":
		break
	val = int(val)
	arr = ['-']*(3**val)
	length = 3**val // 3
	recursion(arr,0,length)
	for i in arr:
		if i == '-':
			print('-',end="")
		else:
			print(' ',end="") 
	print()