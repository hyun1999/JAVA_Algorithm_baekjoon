N,M = map(int,input().split(" "))
candy = []
for _ in range(N):
	candy.append(list(map(int,input().split(" "))))

dp = [[0] * M for _ in range(N)]
for i in range(M):
	dp[0][i] = dp[0][i-1] + candy[0][i]

for j in range(N):
	dp[j][0] = dp[j-1][0] + candy[j][0]

for i in range(1,N):
	for j in range(1,M):
		dp[i][j] = max(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]) + candy[i][j]

print(dp[N-1][M-1])