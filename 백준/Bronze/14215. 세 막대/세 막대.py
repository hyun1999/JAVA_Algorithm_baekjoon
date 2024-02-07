a = list(map(int,input().split()))
a.sort()
b = a[2]
while True:
    if a[0]+a[1] > b:
        print(a[0]+a[1]+b)
        break;
    else:
        b-=1