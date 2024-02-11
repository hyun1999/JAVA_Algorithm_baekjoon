n = int(input())
arr = [str(input()) for i in range(n)]
setArr = list(set(arr))
setArr.sort()
setArr.sort(key=len)

for i in setArr:
    print(i)