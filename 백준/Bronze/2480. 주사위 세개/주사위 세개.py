a,b,c = map(int,input().split())
if a==b==c:
    print(10000+a*1000)
elif a!=b!=c and a!=c:
    maxVal = max(a,b,c)
    print(maxVal*100)
else:
    if a==b or a==c:
        print(1000+a*100)
    else:
        print(1000+b*100)
        