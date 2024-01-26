a = int(input())
if a == 1:
    print(1)
else:
    start = 2
    last = 7
    start_c = 6
    last_c = 12
    count=2
    while True:
        if(start <= a <= last):
            print(count)
            break
        else:
            count+=1
            start += start_c
            last += last_c
            start_c += 6
            last_c += 6
