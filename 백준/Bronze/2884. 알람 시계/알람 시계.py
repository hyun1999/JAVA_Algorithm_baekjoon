h,m = map(int,input().split())
total = h*60+m-45
m = total%60
h = total//60
if h<0:
    h += 24
print(h,m)