n = int(input())
for i in range(n):
    cnt,word = map(str,input().split())
    for j in range(int(len(word))):
        print(word[j]*int(cnt),end='')
    print()