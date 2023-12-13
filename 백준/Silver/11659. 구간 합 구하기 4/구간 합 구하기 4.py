n,m = map(int,input().split(" "))
numbers =  list(map(int,input().split(" ")))
arrayList = [list(map(int,input().split(" "))) for _ in range(m)]
sum = 0
prefix_sum = [0]
for i in numbers:
    sum += i
    prefix_sum.append(sum)

for i in arrayList:
    print(prefix_sum[i[1]] - prefix_sum[i[0]-1])