import math

a,b = map(int,input().split())
c,d = map(int,input().split())
mo = b*d
ja = a*d+c*b
gcd_val = math.gcd(mo,ja)
print(int(ja/gcd_val),int(mo/gcd_val))