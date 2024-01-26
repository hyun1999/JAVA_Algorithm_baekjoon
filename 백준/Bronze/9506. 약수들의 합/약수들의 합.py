while True:
    n = int(input())
    if(n == -1):
        break
    array = []
    for i in range(1,n):
        if n%i == 0:
            array.append(i)
    total = 0
    for i in array:
        total += i
    if total == n:
        print(n,'=',end=' ')
        for i in range(len(array)-1):
            print(array[i],'+',end=' ')
        print(array[len(array)-1])
    else:
        print(n,'is NOT perfect.')