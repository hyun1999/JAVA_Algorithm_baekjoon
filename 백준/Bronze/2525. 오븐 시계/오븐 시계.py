h,m = map(int,input().split())
add = int(input())
total = h*60+m+add
h = total//60%24
print(h,total%60)