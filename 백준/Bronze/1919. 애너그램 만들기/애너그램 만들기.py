str1 = input()
str2 = input()
arr1 = [0] * 26
arr2 = [0] * 26
for i in str1:
    arr1[ord(i)-97] += 1
for i in str2:
    arr2[ord(i)-97] += 1
result = 0
for i in range(26):
    result+=abs(arr1[i] - arr2[i])
print(result)