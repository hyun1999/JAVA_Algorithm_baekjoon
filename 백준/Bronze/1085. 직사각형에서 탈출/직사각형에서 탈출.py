x,y,maxX,maxY = map(int,input().split())
print(min(min((x),(y)),min((maxX-x),(maxY-y))))