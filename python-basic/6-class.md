# ![30%](images/img_white.png)
# Python Basic
## 6. 클래스와 객체 
CodeSquad

---
<!-- page_number: true -->
# 팁:  `*args, **kwargs` 의 사용법 
```
def foo(a, b, *args):
    print(a, b)
    print(args)


def bar(a, b, **kwargs):
    print(a, b)
    print(kwargs)


foo(1, 2, 3, 4, 5, 6, 7, 8)
bar(1, 2, c=3, d='apple', e=5)
```
---
# 클래스 생성하기 
```python
class 클래스이름:
    클래스_변수_선언 
    
    def 메소드1(self, ... ):
          인스턴스 변수 선언 
    	  코드 블록 
    # ...

```

---
# 클래스 선언하기

self는 자바의 this와 유사 
**반드시 클래스의 메소드에는 self가 첫번째 args로 있어야 함** 

```
class Car:
    total = 0  # class 변수, 인스턴스간 값을 공유 

    def accel(self, delta):
        self.speed += delta

    def old(self, year):
        self.price -= year * 1000

    def paint(self, color):
        self.color = color

car = Car()
car.paint("red")
print(car.color, car.total)
print(car)
```
   
---
# 생성자

인스턴스 변수는 생성자나 메소드 안에서 초기화할 수 있다. 
```
    def __init__(self, name, price, color):
        self.name = name
        self.price = price 
        self.color = color
        self.speed = 0 
        Car.total += 1
```

---
# special method
<pre style="font-size:.65em;">
   def __str__(self):
        return "{} ({}), ${}".format(self.name, self.color, self.price)


car = Car("bmw3", 40000, "white")
print(car, Car.total)
car2 = Car("golf", 50000, "black")
print(car2, Car.total)
car.paint("red")
car.old(1)
print(car)
</pre>


---
# 상속 
<pre style="font-size:.6em;">
class Animal:
    def __init__(self, name, year):
        self.name = name
        self.year = year
        print("{} was born in {}".format(self.name, self.year))

    def eat(self, food):
        print("{} eat {}".format(self.name, food))

    def move(self):
        pass #what is pass keywords?


class People(Animal):
    def eat(self, food):
        Animal.eat(self, food)
        print("맛있게 먹었으니 0 칼로리")

    def study(self):
        print("{} feel asleep".format(self.name))


man1 = People("John", 1945)
man1.eat("Chicken")
</pre>

---
# 더 생각해 보기
추상 클래스가 있을까요?


---
# 프로그래밍 연습 
간단 블랙잭 만들기 
1. Player 클래스 생성
- name, money, cards 를 가짐 
2. Deck 클래스 생성
- 52장의 카드셋을 가짐 
- 최초 객체 생성시 카드를 셔플 
- 카드가 없을 경우 카드 한 벌 새로 보충 및 셔플
- pop(player) - 덱에서 첫번째 카드를 플레이어에게 추가함 

---
## 규칙 
- PC 및 플레이어 두명이 게임 진행 
- 최초 2장의 카드를 각각 나눠줌, 딜러의 카드는 한 장만 공개 
- 플레이어는 추가로 카드를 한 장 더 받을지 선택할 수 있음
- 21이 넘으면 플레이어의 패배 

## 팁 
```
import time
time.sleep(1) #1초간 슬립 