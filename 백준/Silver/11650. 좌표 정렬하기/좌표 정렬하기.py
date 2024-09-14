import sys
N = int(sys.stdin.readline().rstrip())
nums = []
for _ in range(N):
	num = list(map(int,sys.stdin.readline().split(" ")))
	nums.append(num)

nums = sorted(nums)
for num in nums:
	print(' '.join(map(str,num)))