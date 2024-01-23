a,b = map(str,input().split())
reverse_name = ''
for i in a:
    reverse_name = i+reverse_name
    a = reverse_name
reverse_name = ''
for i in b:
    reverse_name = i+reverse_name
    b = reverse_name
if int(a)>=int(b):
    print(a)
else:
    print(b)
