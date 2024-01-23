word = input()
for i in range(26):
    a = word.find(chr(i+97))
    print(a,end=' ')