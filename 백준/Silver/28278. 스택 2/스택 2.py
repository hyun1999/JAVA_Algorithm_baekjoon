import sys
n = int(sys.stdin.readline())
arr = []
for i in range(n):
    input_vals = list(map(int,sys.stdin.readline().split()))
    if input_vals[0] == 1:
        arr.append(input_vals[1])
    elif input_vals[0] == 2:
        if len(arr)==0:
            print(-1)
        else:
            print(arr.pop())
    elif input_vals[0] == 3:
        print(len(arr))
    elif input_vals[0] == 4:
        if len(arr)==0:
            print(1)
        else:
            print(0)
    else:
        if len(arr)==0:
            print(-1)
        else:
            print(arr[len(arr)-1])