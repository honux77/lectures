# ![30%](images/img_white.png)
# Python Basic
## 2. 변수, input, print
CodeSquad

---
<!-- page_number: true -->
# 객체 유형 

파이썬은 모든 것이 객체(object)로 이루어짐 
type 명령을 이용해서 type을 체크 가능 
> type(3)
> type(3.14)
> import random
> type(random)
> type(random.random)

---
# 변수 사용하기
일반적인 프로그래밍 언어와 같음
> a = 3
> b = 3.14
> c = "Honux"
> type(a)
> type(b)
> type(c)


---
# 계산 연산자 사용해 보기 

> a = 10
> b = 3.5 
> a + b 
> a * b 
> a / 3
> a // 3 
> a ** 3 
> 5 * 10 + 5 
> 5 * (10 + 5)
> "hello " + 25 
> "hello " + str(25)
> "hello " * 3

---
# big number

> 117 ** 20
> a = 2.6e50
> a ** 2
---
# 증감 연산자 
파이썬에는 증감 연산자가 없다. 
```
a = 3 
# a++ error 
a += 1 # a = a + 1
```

---
# 키보드로부터 입력 받아 변수에 저장하기 

> a = input()
> 35 
> a
> type(a)
> b = int(a)
> b 
> type(b)

---
# 화면에 출력하기

> a = input()
> world
> b = int(input())
> 35
> print("hello")
> print("hello" + a)
> print("hello", a)
> print("hello" + a + str(b))
> print("hello %s " % a)
> print("hello %s %d" % (a, b))

---
# 포맷 스트링1 (old style)

C 언어의 포맷 스트링과 거의 유사하다
> %d: 정수
> %s: 문자열
> %f: 실수 
> %.2f: 2자리 실수 (3자리에서 반올림)
> %10s: 왼쪽 정렬 
> %-10s: 오른쪽 정렬 


---
# 포맷 스트링2 (new style)

new 스타일이 더 낫다고 한다.
new 스타일에는 여러가지 편한 기능이 많으니 연습하자. 

> "{} {}".format(5, 10)
> "{:.2f} {:.3f}".format(3.1415, 3.1415)
> "{:10} {:10}".format(5, 10)
> "{:10} {:10}".format("hello", "world")
> "{:>10} {:>10}".format("hello", "world")
> "{}".format(117 ** 10)
> "{:e}".format(117 ** 10)
https://pyformat.info/ 

---
# newline, tab, raw string
```
print("hello\tsmall\nworld")
print("It\'s small.\nYes?")
print(r"It\'s small.\nYes?")
```
r은 raw string으로 주로 regular expression을 사용할 때 사용한다.

---
# print without newline 
```
print("What is your name? ", end='')
name = input()
print("Hello", name)

```

---
# 프로그래밍 연습

1. 원의 반지름을 입력받으면 둘레와 넓이를 출력하는 프로그램을 작성하라. 
결과값은 반올림으로 소수 둘째 자리까지 구할 것. 

```
반지름을 입력하세요(cm): 5
입력값: 5 cm 
둘레: 31.42 cm^2 넓이: 78.54 cm^2
```
---
2. 포맷 스트링을 이용해서 다음과 같이 출력하시오. 
```
    *
   **
  ***
 ****
*****
```

---
3. 키와 체중을 입력하면 BMI를 출력하는 프로그램을 작성하시오. 
결과는 소수 첫째자리까지 출력할 것.

$$
BMI= \frac w {t^2}
$$ 

$$
w= weight (kg)
$$

$$t= height (m)$$
> 입력: 172 70
> 출력: 23.7

* 참고로 BMI > 25 과체중, BMI > 30 비만
* 힌트: float(num)을 사용해 보기 

---
# PEP8

PEP8은 코딩 컨벤션에 관한 권고, 강제는 아니지만 지키면 좋다.
pycharm에서는 기본으로 체크해줌
pep8과 pylint 명령어로 체크도 가능 

```
# pep_test.py
print("input number?", end = '')
```

> pip3 install pep8 pylint
> pep8 pep_test.py
> pylint pep_test.py

* pip, pip3: 파이썬 패키지 설치 프로그램
