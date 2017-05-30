# ![30%](images/img_white.png)
# Python Basic
## 4. 함수의 기초 
CodeSquad

---
<!-- page_number: true -->
# 팁: _ 사용하기 
파이썬에서 `_`와 `__`는 종종 특별한 의미를 가집니다.
for 문에서는 변수를 사용하지 않을때 사용합니다. 

```python
for _ in range(10):
    print("hello")
```
---
# 함수 만들기 
```
def 함수이름(arg1, arg2):
    코드 블록
    리턴 
```

리턴, 리턴 값, 매개변수는 없어도 됩니다. (optional) 

---
# 함수 예시
```
def mysum(n1, n2):
    return n1 + n2 

c = mysum(10, 20)
print(c)
```

---
# 리턴 없는 함수의 리턴?
리턴이 없을 경우 None을 리턴합니다. 
**종종 실수하는 경우가 있으니 조심할 것**
```
def mysort(arr):
    arr.sort()

a = [5, 3, 2, 4, 6]
b = mysort(a)
print(a)
print(b)
```

---
# 함수 안에서 전역 변수 사용하기 
파이썬에서도 다른 언어처럼 스코프가 있습니다. 
**파이썬의 전역 변수는 그냥 사용하면 읽기 전용입니다.**
**지역변수와 전역변수의 이름이 같을 경우 PEP8 경고가 발생합니다.**
```
g1 = 10


def foo(a):
    b = g1 + a
    print(b)

print(g1)
foo(20)
```

---
# 전역 변수 쓰기 용으로 사용하기
`global` 키워드를 사용합니다. 
```
g1 = 10


def foo(a):
    global g1
    g1 = g1 + a

print(g1)
foo(20)
print(g1)
```

---
# 프로그래밍 연습 
1. factorial을 계산하는 함수를 만들어 봅시다.
```
a = myfact(5) # 5 * 4 * 3 * 2 * 1
print(a) # 120
```

2. `size * 2 - 1` 높이의 다이아몬드를 출력하는 함수를 작성하기. 
```
diamond(3)
  *
 ***
*****
 ***
  *
