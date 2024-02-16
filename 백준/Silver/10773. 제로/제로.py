import sys
n = int(input())
arr = []
for i in range(n):
    input_val = int(sys.stdin.readline().rstrip())
    if input_val != 0:
        arr.append(input_val)
    else:
        arr.pop()
print(sum(arr))
