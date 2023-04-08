from collections import deque
def bfs(g,s,visi):
    queue = deque([s])
    visi[s] = True
    while queue:
        v = queue.popleft()
        for i in g[v]:
            if not visi[i]:
                queue.append(i)
                visi[i] = True
    return visi
            
def solution(n, computers):
    answer = 0
    vi = [False] * n
    _map = [];
    for com in range(len(computers)):
        _m = [];
        for c in range(len(computers[com])):
            if (computers[com][c]==1 and c != com):
                _m.append(c)
        _map.append(_m)
    for i in range(n):
        if not vi[i]:
            answer+=1
            vi = bfs(_map, i, vi)
    return answer