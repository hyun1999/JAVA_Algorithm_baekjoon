n = int(input())
total = 0
for i in range(n):    # 단어 개수
    error = 0
    word = input()
    for j in range(0,len(word)-1):
        if word[j]!=word[j+1]:
            slice_word = word[j+1:]
            if slice_word.find(word[j]) > 0:
                error+=1
                break
    if error == 0:
        total+=1
print(total)
