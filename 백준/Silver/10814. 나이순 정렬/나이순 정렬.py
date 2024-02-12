n = int(input())
arr = []
for i in range(n):
    age,name = map(str,input().split())
    age = int(age)
    arr.append([age,name])
for i in range(n):
    arr[i].append(i)

arr.sort(key = lambda x:(x[0],x[2]))
for i in arr:
    print(i[0],i[1])