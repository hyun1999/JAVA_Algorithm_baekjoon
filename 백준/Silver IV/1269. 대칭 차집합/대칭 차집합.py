import sys
n,m = map(int,input().split())
arr_A = list(map(int,input().split()))
arr_B = list(map(int,input().split()))
print(len(set(arr_B)-set(arr_A))+(len(set(arr_A)-set(arr_B))))