import sys
n = int(input())
a = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
for i in a:
    print(sum(i))