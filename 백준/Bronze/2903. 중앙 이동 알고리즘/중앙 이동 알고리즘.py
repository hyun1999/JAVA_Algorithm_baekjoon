n = int(input())
init = int(2)
for i in range(1,n+1):
    init+=2**(i-1)
print(init*init)