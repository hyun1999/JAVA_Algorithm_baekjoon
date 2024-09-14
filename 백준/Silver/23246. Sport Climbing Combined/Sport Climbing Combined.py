N = int(input())
scores = [tuple(map(int,input().split())) for _ in range(N)]
scores = sorted(scores,key=lambda x:(x[1]*x[2]*x[3],x[1]+x[2]+x[3],x[0]))
for i in range(3):
	print(scores[i][0],end=" ")