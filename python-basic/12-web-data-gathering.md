# ![70%](images/img_white.png)
# Python Basic
## 웹 데이터 크롤링 
CodeSquad 

---
# 크롤링의 유형
## 정적인 크롤링
## 동적인 크롤링

난이도는? 웹 개발자 / 프론트 개발자에게는 어렵지 않다. 
당연히 동적인 페이지의 크롤링이 더 어렵다. 

---
# 누가 데이터를 보내 주나?
- 서버 사이드 렌더링
- 클라이언트 사이드 렌더링 

---
# 준비하기
```
pip3 install bs4
```

브라우저를 열어 해당 페이지의 원하는 데이터가 자바스크립트 없이 보이는지를 확인한다.

크롬 확장 프로그램 등을 사용하면 조금 더 편하게 찾을 수 있다. 

---
# 정적 페이지 크롤링 

css selector와 python 문법을 이용 원하는 키워드를 추출하는 것이 핵심
**id 가 있다면 편하게 찾을 수 있다.**

```
import request
from bs4 import BeautifulSoup

result = requests.get('http://codesquad.kr')

bs = BeautifulSoup(result.text, 'html.parser')

elements = bs.select('div#...')

elem = elements.select_one('...')

# ...
```
https://www.w3schools.com/cssref/css_selectors.asp 

---
# 실습 
네이버 실시간 검색어를 크롤링해서 구글 독스에 업데이트를 해 보자. 

---
# 문제가 생겼을 때 
1. IP를 바꿔본다.
2. headers의 User-Agent값을 바꿔본다. 

---
# 동적 페이지 크롤링 
1. selenium을 이용할 수 있다. 
2. phantomjs, 기타 등등 


---
# 범법 여부

- 악용할 경우 불법이 될 수 있음 
- 사례는 많지 않음 
