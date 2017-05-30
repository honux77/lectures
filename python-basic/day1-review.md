# ![30%](images/img_white.png)
# Python Basic
##  1일차 복습 문제 
CodeSquad

---
<!-- page_number: true -->
# 1일차 학습 내용
- 변수, 타입
- if, for, while 
- function 
- list, dict, tuple
- class 
- simple file read, write
- pickle dump / load 

---
# simple if else 

```
if a > 3:
    a = 1
else 
    a = 0

# a = (a > 3) ? 1 : 0

a = 1 if a > 3 else 0
```
---
# lambda 
익명 함수 
```
def mysum(x, y):
    return x + y 

c = mysum(1, 2)
```

```
(lambda x,y: x + y)(1,2)
```
---
# map 
리스트의 원소들을 변형시키고 새로운 리스트를 리턴 
`help(map)`
```python
a = [1, 2, 3, 4, 5]

def myfunc(x):
    return x * x
  
list(map(myfunc, a))

list(map(lambda x: x * x, a)
```

---
# reduce 
리스트의 원소들을 누적해서 계산 결과를 뽑아냄 
```
from functools import reduce 
reduce(lambda x, y: x + y, a)
reduce(lambda x, y: y + x, "abcde")
```
---
# filter 
리스트에서 조건을 만족시키는 원소만 걸러내서 새로운 리스트를 만듬 
list(filter(lambda x: x > 3, [1, 2, 3, 4, 5, 6]))

---
# 예제 
1. 주어진 리스트의 원소를 제곱해서 만든 새로운 리스트의 원소 중 10보다 큰 수의 합을 출력하시오.
2. 
2. 주어진 문자열에서 대문자만 추출한 새로운 문자열을 만드시오. 


---
# 프로그래밍 연습

1. Account class 만들기 
- id, name, phone, money, 
- save, withdraw, sendMoney 

2. Log class 만들기 
- userid, operation, date


3. main UI의 기능을 구현하시오. 
```
1. new account 
10. show account log 
11. save
12. withdraw
13. send

21. save data
22. load data
```