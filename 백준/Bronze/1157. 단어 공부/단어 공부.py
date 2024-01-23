word = input().upper()
set_word = list(set(word))
count_list = []
for x in set_word:
    cnt = word.count(x)
    count_list.append(cnt)
if count_list.count(max(count_list))>1:
    print('?')
else:
    max_index = count_list.index(max(count_list))
    print(set_word[max_index])