# ![30%](images/img_white.png)
# Python Basic
## 5. List, String, Dictionary, Tuple
CodeSquad

---
<!-- page_number: true -->
---
# 리스트 
원소의 삽입 삭제가 자유로운 배열, 사용하기 편리하다. 

> a = []
> a.append(1)
> a.append(2)
> a.append('dog')
> print(a)
> a[0]
> len(a)

---
# 리스트에 아이템 추가 
> a.append(100)
> a.extend([101, 102, 103])
> a.insert(0, 255)
> a.insert(100, 255)
> a.append([104, 105])

---
# 리스트에서 아이템 삭제하기

> a.remove(100)
> a.remove(-99)
> del a[0]
> x = a.pop()

---
# 검색 

> 100 in a:
> a.index(100)
> a.index(155) #bad 

```
if 155 in a:
    print(a.index(155))
```
---
# 리스트 정렬하기, 뒤짚기

> a.sort()
> a.reverse()
> a.sort(reverse=True)

---
# 리스트 잘라내기
> a = [1, 2, 3, 4, 5]
> a[0:4]
> a[2:]
> a[:3]
> a[:-1]
> a[-1:]
> a[:]

---
# 참조와 바인딩, 리스트 복사하기 
> a = [1, 2, 3, 4, 5]
> b = a
> a.remove(3)
> a == b 
> b.append(6)
> a == b
> b = a[:]
> a == b
> b.remove(2)
> print(a, b)
> c = a.copy()
> a == c

---
# 문자열 
파이썬의 문자열은 immutable (불변, 변경 불가능) 입니다.
리스트와 유사한 시퀀스의 일종입니다.
* 참고: 일반 숫자, 문자열, 잠시 뒤에 나오는 튜플은 모두 불변 타입입니다.

> a = "hello,world"
> a[0] 
> a[-4:]
> "lo" in a
> "zz" in a
> a.index("l")

---
# 문자열과 리스트 바꾸기
> a = "hello"
> b = list(a)
> "".join(b)
> c = ",".join(b)
> c.split(",")

---
# 프로그래밍 연습
다음 문자열을 공백을 기준으로 분리하고 숫자형으로 변환하여 리스트에 담으세요. 
```
a = "1,2,3,4,5,6,7,8,9,10,11"
b = intArray(a)
print(b) 
```

--- 
# 자주 사용하는 python스러운 문법
```
b = [ int(s) for s in a.split(",") ]
```
---
# 멀티라인 문자열 
```
a = '''\
hello
I 
am 
tom'''
a.split()
for line in a.split():
	print(a)

```
---
# dictionary

리스트 다음으로 많이 사용되는 자료 구조. 
자바의 해시맵, JS의 오브젝트와 유사한 기능을 가졌습니다.
key를 가지고 value를 찾고 싶을 때 사용합니다.

---
# dictionary 

> a = {}
> a['key1'] = 'apple'
> a['key2'] = 'banana'
> a['mykey'] = 'myvalue'
> a['honux'] = '010-1234-5678'
> print(a['honux'])
> a.keys()
> a.values()
> 'key1' in a
> 'apple' in a.values()

---
# dictionay 정렬해서 순회하기 
원래 주 용도는 아니지만 dictionary도 순회 가능 
```
for key in sorted(a.keys()):
	print(key, a[key])
```

---
# 프로그래밍 연습 
```
items = {}
items[0] = 'apple'
items[1] = 'orange'
items[2] = 'carrot'
items[3] = 'banana'
```

값을 기준으로 정렬하고, key와 값을 출력할 수 있을까요? 

---
# tuple
값의 쌍, 불변 객체 
tuple은 불변이지만 tuple안의 객체 값은 바뀔 수 있다. 
괄호도 필수는 아니지만 쓰는 것을 권장한다. 

> a = (3,5)
> a[0]
> a[1]
> a[0] = 10 #error
> a = (b,c) = (10, 20) 
> (c, b) = (b, c) 

---
# 프로그래밍 연습 
1. 전화번호부 만들기 
(1) 입력받은 이름과 번호를 저장하고
(2) 이름으로 번호를 검색 
(3) 이름순으로 번호를 정렬해서 전체 출력


---
2. 로또 시뮬레이터 만들기 
(1) 당첨 번호 로또는 하드 코딩으로 입력 
`first = [13, 14, 26, 28, 30, 36]`
(2) 금액을 입력받아서 해당 금액으로 구매가능한 숫자의 로또를 무작위로 구매한다. 로또 1매의 가격은 1,000원이다. 
(3) 구매한 로또의 당첨금을 계산해서 일치수별 매수 및 당첨금의 총합과 손익률을 출력한다. 

| 일치수 | 당첨금 |
| ------|-----|
| 3 | 5000 |
| 4 | 50,000 |
| 5 | 1,500,000 |
| 6 | 1,000,000,000 |

---
## 힌트 
```
a = [1,2,3]
import random 
random.shuffle(a)
random.choice(a)
```
## 예상 결과 
```
1등: [13, 14, 26, 28, 30, 36]
당첨매수: [3588, 300, 11, 0]
손실: 100000000 49440000 49.44
```



