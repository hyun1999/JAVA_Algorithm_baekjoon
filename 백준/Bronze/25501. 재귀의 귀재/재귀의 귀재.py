global a
def recursion(s,l,r):
    global a
    a+=1
    if l>=r:
        return 1
    elif s[l] != s[r]:
        return 0
    else:
        return recursion(s,l+1,r-1)

def isPalindrom(s):
    return recursion(s,0,len(s)-1)

num = int(input())
for i in range(num):
    a = 0
    print(isPalindrom(input()),a)