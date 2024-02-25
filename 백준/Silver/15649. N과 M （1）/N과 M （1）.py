import sys
input = sys.stdin.readline

N,M = map(int,input().split())
result = []
bool_val = [False]*(N+1)

def recur(num):
    if num == M:
        print(' '.join(map(str,result)))
        return
    for i in range(1,N+1):
        if bool_val[i] == False:
            result.append(i)
            bool_val[i] = True
            recur(num+1)
            bool_val[i] = False
            result.pop()

recur(0)