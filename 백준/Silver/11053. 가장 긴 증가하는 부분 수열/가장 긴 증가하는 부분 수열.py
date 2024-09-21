N = int(input())
nums = [0] + list(map(int,input().split()))

dp = [-1] * (N+1)
# 초기 값 설정
dp[1] = 1

# 메인 로직
for n in range(2,N+1):
	best = 0
	for i in range(1,n):
		if nums[n]>nums[i]:
			best = max(best,dp[i])
	dp[n] = best + 1

print(max(dp[1:]))