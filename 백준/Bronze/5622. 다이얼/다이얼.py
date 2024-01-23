word = input()
total = 0
for i in range(len(word)):
    if word[i] in ['A','B','C']:
        total +=3
    elif word[i] in ['D','E','F']:
        total +=4
    elif word[i] in ['G','H','I']:
        total +=5
    elif word[i] in ['J','K','L']:
        total +=6
    elif word[i] in ['M','N','O']:
        total +=7
    elif word[i] in ['P','Q','R','S']:
        total +=8
    elif word[i] in ['T','U','V']:
        total +=9
    elif word[i] in ['W','X','Y','Z']:
        total +=10
print(total)
