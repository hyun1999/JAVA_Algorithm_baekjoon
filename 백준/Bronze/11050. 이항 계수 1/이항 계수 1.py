from itertools import combinations
n,k = map(int,input().split())
arr1=[]
for i in range(n):
    arr1.append(0)
print(len(list(combinations(arr1,k))))