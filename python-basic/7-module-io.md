# ![30%](images/img_white.png)
# Python Basic
## 7. 모듈과 패키지, 파일 IO
CodeSquad

---
<!-- page_number: true -->
# 간단 모듈 만들기
```
# myutil.py 

def hello():
    print("Hello, It's time to go home")


def mysum(*args):
    sum = 0
    for i in args:
        sum += i
    return sum

if __name__ == "__main__":
    hello()
    n = mysum(1,2,3,4,5)
    print(n)
```
---
# 모듈 사용하기

```
# mytest.py 

import myutil

print("hello.py")
myutil.hello()
print(myutil.mysum(1, 2, 3, 4, 5))
```

---
# 모듈 사용하기2
```
from myutil import hello, mysum

print("hello.py")
hello()
print(mysum(1, 2, 3, 4, 5))
```

---
# 팁 
파이썬 파일 작성시 주의사항 
모듈과 이름이 같으면 해당 모듈을 사용할 수 없으므로 주의 

```
# random.py
# error and hard to find the reason to fail 
import random
print(random.randint(1,100))
```

---
# python 표준 모듈 사용해 보기

> import time 
> time.sleep(1)
> time.asctime()
> import datetime
> datetime.datetime.now()
> import math
> math.sin(math.pi / 2)
> math.ceil(10.5)
> math.floor(10.5)
> math.log2(8)


---
# package 
네임스페이스에 `.`을 사용해서 표기하기 위한 방법 
아래와 같은 디렉토리 구성
```
honux
├── __init__.py
├── some1.py
├── some2.py
└── utils
    ├── __init__.py
    └── sound.py
```

---
# package 사용해 보기 
```
from honux import some1, some2
from honux.utils import sound

some1.hello()
some2.foo()
some2.bar()
sound.bye()
```

---
# `__init__.py`

최초 생성시 비어 있음 

`from abc import *` 로 import 되는 모듈을 지정함 
```
__all__ = ["some1", "some2"]
```

```
from honux import *
```


---
# 간단 파일 읽기
```
f = open('assets/module.txt', 'r', encoding='utf-8')
for line in f:
    print(str(line), end='')
f.close()
```

---
# 파일 읽기2
```
f = open('assets/module.txt', 'r', encoding='utf-8')
lines = f.readlines()
print(lines)
```

---
# 파일 읽기3
닫는 게 귀찮을 때 `with`와 함께...

<pre style="font-size:.7em">
with open('assets/module.txt', 'r', encoding='utf-8') as file:
    lines = file.readlines()
    for line in lines:
        print(line, end='')
</pre>

---
# (참고) 바이너리 파일 읽기 / 쓰기 

https://gist.github.com/honux77/9b665acef0b7e68c748bd5727451b79b

---
# 파일 쓰기 
```
f = open('assets/write.txt', 'w')
f.write("hello\n")
f.write("world\n")
f.close()
```

---
# 파일에 내용 추가하기
```
f = open('assets/write.txt', 'a')
# ...
```

---
# pickle 
아주 쉽게 객체를 파일로 저장하는 놀라운(?) 기능을 수행 
**"b"모드로 열어야 함을 주의할 것**
```
import pickle

plist = [1, 2, 3, 'honux', '정호영']

with open('assets/pickle.pkl', 'wb') as f:
    pickle.dump(plist, f)

with open('assets/pickle.pkl', 'rb') as f:
    what = pickle.load(f)

print(what)
```
---
# 프로그래밍 연습

파일 저장이 가능한 주소록을 만들어 봅시다. 