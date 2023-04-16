_input = [list(input().split()) for _ in range(20)]
_sum = 0
_study = 0
score = {'A+':4.5, 'A0':4,'B+':3.5,'B0':3,'C+':2.5,'C0':2,'D+':1.5,'D0':1,'F':0}

for i in _input:
    if i[2] =='P':
        continue;
    _sum += score[i[2]]*float(i[1])
    _study += float(i[1])

print(round(_sum / _study, 6))