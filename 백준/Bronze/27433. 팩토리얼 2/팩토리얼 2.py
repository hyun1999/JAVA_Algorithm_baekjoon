def jagui(i):
    if i == 1:
        return 1
    else:
        return i*jagui(i-1)
n = int(input())
if n == 0:
    print(1)
else:
    print(jagui(n))
