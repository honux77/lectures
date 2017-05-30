# ![70%](images/img_white.png)
# Learn Django Basic
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung
</p>

---
<!-- page_number: true -->

# Python and Django 

## Life is short, learn python!

---
## Python
배우기 쉽고 활용도가 높은 강력한 스크립트 언어 

## Django
파이썬으로 만든 웹 프레임워크

## Flask
또 다른 파이썬 기반 웹 프레임워크 

---

# Django 설치하기

pc 또는 linux에 설치합니다.

- 파이썬3.5 설치 
- virtualenv 설치?
- django 1.10 설치

---
# ubuntu django install
```
sudo apt install python3
sudo apt install python3-pip
sudo pip3 install virtualenv myenv
source myenv/bin/activate
pip install django==1.10
pip freeze
```

---
# 장고 시작하기 & Hello world
```
django-admin startproject mysite
cd mysite
python manage.py startapp simple
# settings.py 수정 
python manage.py migrate
python manage.py runserver 0.0.0.0:8000
```
이후 브라우저를 열여서 서버주소

---
# 생각해 보기: HTTP의 원리
만든사람: 팀 버너스리

어디서, 왜 만들었을까?

무엇을 만들었을까?

https://opentutorials.org/course/1688/9334

https://www.ted.com/talks/tim_berners_lee_on_the_next_web?language=ko

---
## simple/views.py 수정 
```python
from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def hello(request):
    html = "<h1>Hello, CodeSquad</h1>"
    return HttpResponse(html)
```
## mysite/urls.py 수정
```
from simple import views

urlpatterns = [
    url(r'^admin/', admin.site.urls),
    url(r'^hello/', views.hello),
]
```
웹에서 http://serverip:8000/hello/ 로 접속해 보기 

---
# 실습: 동적 페이지로 바꿔보기
- 새로 고칠 때마다 100 - 199 사이의 무작위 수를 보여주기 
- 또는 로또 번호 생성해 보기 


---
## 템플릿 적용해 보기 

simple/hello.html
```
<!DOCTYPE html>
<html lang="ko">
<body>

<div>
  <h1>Who Am I?</h1>
  <p>간단한 템플릿입니다.</p>
</div>

</body>
</html>
```
simple/views.py
```
def hello(request):
    return render(request, 'simple/hello.html', {})
```
:exclamation: 장고를 재시작해야 템플릿이 적용됩니다. 

---
# 템플릿에 동적 데이터 집어 넣기 


<pre style="font-size: 0.7em">
def hello(request):
    me = {'name':'honux', 'age': 25}
    return render(request, 'simple/hello.html', { 'data': me })
</pre>

```html
    <div>
      <h1>Who Am I?</h1>
      <p>{{data.name}}, {{data.age}}</p>
    </div>
```

---
# 실습
템플릿을 이용해서 로또 자동 생성 페이지를 만들어 봅시다. 


---
# model 만들기 
simple/models.py

<pre style="font-size:.7em">
from django.db import models
from django.utils import timezone

# Create your models here.
class Memo(models.Model):
    name = models.CharField(max_length=30)
    text = models.TextField()
    published_date = models.DateTimeField(auto_now_add=True)
</pre>

```
python manage.py makemigrations
python manage.py migrate
python manage.py createsuperuser
```
http://ip:8000/admin/ 접속
생성한 아이디로 로그인 


---
# admin 추가 및 데이터 입력 
-simple/admin.py 편집
```
admin.site.register(Post)

```
-Memo에 `__str__(self):` 추가 

---
# 새로운 페이지 만들기 
<pre style="font-size:.7em">
def memo(request):
    memos = Memo.objects.all().order_by('-published_date')
    return render(request, 'simple/memo.html', {'memos': memos})
</pre>

---
# 참고: 장고 MTV 
![](https://wayhome25.github.io/assets/post-img/django/mtv.png)

---
# form 만들어 보기 
-mysite/urls.py
```
    url(r'^memo/$', views.memo, name='board'),
    url(r'^memo/write/$', views.Write.as_view()),
```
- simple/views.py
<pre style="font-size:.7em">
from django.views.generic.edit import CreateView
from django.core.urlresolvers import reverse_lazy

class Write(CreateView):
    model = Memo
    fields = ['name', 'text']
    success_url = reverse_lazy('board')
</pre>

---
# 템플릿 추가 및 수정 

- simple/memo_form.html
- simple/memo.html

https://github.com/honux77/practice/tree/master/django/simple-django/simple/templates/simple

---
# 완성 소스 

https://github.com/honux77/practice/tree/master/django/simple-django

---
# 해 볼 만한 것들

소셜 로그인 django-allauth 연동 

SNS에서 이름가져오기 

로그인한 유저만 글 쓰게 하기

---
# 더 공부하기 

https://tutorial.djangogirls.org/ko/