# ![30%](images/img_white.png)
# Python Basic
## 3. control flow
CodeSquad

---
<!-- page_number: true -->
# 주석 
```python
# #으로 시작하면 한 줄 주석 
a = 3 #이렇게도 됩니다.

'''
여러 줄 주석은 이렇게 쓸 수 있는데 
권장 하지 않습니다.
'''
# 아래 구문은 오류입니다.
b = "abc #bad syntax 
```
---
# 들여쓰기 (indent)

* 기존 언어의 코드 블록을 표시하기 위해 파이썬은 공백을 사용한다.
* 같은 수준의 공백은 같은 블록으로 간주된다. 
* 파이썬에서는 **스페이스 4칸**을 공백으로 권장한다. 
* 보통 에디터에서 자동으로 들여쓰기를 해 준다. 
* **주의: 여러 종류의 에디터를 사용하다 보면 오류가 발생할 수 있다.**


---
```
// java
for (int i == 0; i < 10; i++) {
    if (i > 3) {
    	s = i * 2;
        System.out.println(s);
    }
    System.out.println(i);
}
```
```
# python
for i in range(10):
    if i > 3:
       s = i * 2
       print(s)
    print(i)
```

---
# if 문법
```
if 조건식: 
    코드 블록 1 
elif 조건식2:
    코드 블록 2 
else:
    코드 블록 3 
```
**elif 에 주의 (else if가 아님)**

---
# 조건식 테스트
```
# a = 3
# b = 3

True 
False
a > 5
a == 3
"el" in "hello" 
i > 5 and b > 1
a < 3 or b < 1 
3 <= a < 5
```
---
```
a = None #null과 유사 
a is None
a is not None
a = 3 
a == 3
not a == 3
```

---
# 홀수 짝수 판별 프로그램 
```
print("정수를 입력하세요:")
n = int(input())

if n % 2 == 0:
    print("짝수입니다.")
else:
    print("홀수입니다.")
```

---
# 프로그래밍 연습

1. BMI 프로그램에서 다음을 추가로 출력하는 프로그램을 작성하시오. 
> BMI > 30: 비만입니다. 운동과 식조절이 필요합니다.
> BMI > 25: 과체중입니다. 관리를 조금 해 보심이?
> BMI <= 25: 정상입니다. 부럽네요!

---
# 리스트 맛보기 
파이썬에는 배열과 유사한 리스트가 있습니다. 
리스트는 `시퀀스`의 일종으로 여러가지 편리한 기능이 있습니다.
파이썬에서 가장 많이 사용하는 자료구조 중 하나입니다. 
(참고로 문자열도 `시퀀스`의 일종입니다.)
> a = [2, 4, 6]
> a.append(8)
> a.remove(0)
> 4 in a
> 100 in a

---
# 문제 
비어 있는 배열은 어떻게 만들까요?
2차원 배열은 어떻게 만들까요? 
아래는 오류일까요? 

`arr = [1, 2, 3, "hello", 5.0]`


---
# range
리스트를 만들어 주는 빌트인 명령어 (사실은 아님) 
실제 리스트는 사용시점에 생기거나 list()를 사용해서 생성할 수 있다. 

https://docs.python.org/3/library/functions.html


```
a = range(10)
type(a)
b = list(a)
type(b)

list(range(10))
list(range(5, 10))
list(range(10, 0, -1) 
```
---

# for 반복문 1
가장 많이 사용하는 형태 
```
for var in range(10):
    print(var)
```

---
# for 반복문 2 
리스트의 아이템을 순회할 때 사용  
```
a = [1, 3, 5, 7, 9]
for i in a:
    print(i)
```
Q: java 언어 같은 for 반복문은 없나요? 
A: 네

---
# 1에서 100까지 더하기
```
sum1 = 0
old = 0
for i in range(1,101):
    old = sum1
    sum1 += i
    print("{} + {} = {}".format(old, i, sum1))
print("sum of 1 to 100 = {}".format(sum1))
```

---
# while 
```
while 조건식: 
    코드블록 1
```

for와 while은 `continue`와 `break`를 사용할 수 있습니다. 

---
# continue 와 break

continue: 현재 블록에서 빠져나와 반복문의 처음 조건식으로 돌아감
break: 반복문을 빠져나가 다음 구문이 실행됨

```
i = 0
while True: #무한루프
	i += 1
    if i % 2 != 0:
    	continue
    print(i)
    if i == 100:
        break
print("end")
```

---
# 임의의 난수 생성하기
random module을 사용합니다.
module에 대해서는 나중에 다룹니다. 
```
import random
rnadom.randint(1,3) # 1 ~ 3 
```

---
# 프로그래밍 연습 

1. 1 - 100 사이의 임의의 난수를 생성하고, 사용자가 입력한 값에 따라 `high, low, correct!`를 알려주는 게임을 작성하라. 
- 숫자를 맞추거나 -1을 입력하면 종료
- 종료시 try 횟수를 알려줌 

답안: https://gist.github.com/honux77/a8c8f20e0651d4418e770a1b4a0bf710 
답을 보지 말고 직접 해 봅시다. 

---
2. 로또 번호를 생성해 주는 프로그램을 작성하시오. 
- 로또는 1-45중 임의의 숫자 6개의 일치여부로 당첨이 결정됩니다. 

---
# easyGUI 사용해 보기 
## 설치 
> pip3 install easygui
## 사용 
<pre style="font-size:0.8em;">
import easygui

name = easygui.enterbox("안녕하세요? 이름이 뭔가요?")
n = easygui.integerbox("좋아하는 숫자는 몇인가요?")
easygui.msgbox("좋은 날이네요. {}를 좋아하는 {}님".format(n, name))
</pre>

---
# 프로그래밍 연습2
easygui를 이용해서 숫자맞추기나 로또를 gui 프로그램으로 바꿔 보자.
