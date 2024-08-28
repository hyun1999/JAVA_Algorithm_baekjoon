import sys
n = int(sys.stdin.readline().rstrip())
arr = list(map(int,sys.stdin.readline().split()))
c = int(sys.stdin.readline().rstrip())

print(arr.count(c))