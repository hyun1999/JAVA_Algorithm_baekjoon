def jagui(i):
    if i == 0:
        return 0
    elif i == 1:
        return 1
    else:
        return jagui(i-1)+jagui(i-2)
n = int(input())
print(jagui(n))