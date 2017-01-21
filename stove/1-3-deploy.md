<!-- page_number: true -->
![30%](images/slogo.png) ![30%](images/stove.png) 
# Learn How to Deploy
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung <br>
</p>

<p align='right'><img src='images/logo.png' width = '15%'> </p>

---
<!-- page_number: true -->
# 배포란?

소스를 서버에 반영하는 것
자동과 수동 두 가지 방법이 있다. 

---
<!-- page_number: true -->
# 소스 저장소를 경유한 배포 
개발 - 로컬 - VCS - 서버 연동을 통해 배포

---
<!-- page_number: true -->
# 직접 해보자!  
1. 리눅스 서버에 로그인 
2. JDK 설치
3. git을 이용해서 소스 가져오기
4. maven을 이용해서 빌드
5. 방화벽 설정 확인
6. 브라우져에서 동작 확인

---
<!-- page_number: true -->
# JDK 수동 설치

## wget을 이용한 JDK 다운로드 
- 오라클 홈페이지에서 다운로드 링크 복사
```bash
$ wget --no-check-certificate --no-cookies \ 
--header \
"Cookie: oraclelicense=accept-securebackup-cookie" 링크
```
- 압축 해제 후 심볼릭 링크 생성 
- 아래 내용을 .bashrc에 추가 
```
export PATH=$PATH:$HOME/java/bin
```

---
<!-- page_number: true -->
# maven을 이용한 빌드 

Spring boot이므로 매우 간단하게 된다.
```
$ ./mvnw spring-boot:run &
```
오류가 날 경우
- 네트워크 문제
- git 저장소에서 일부 파일을 누락했을 경우 

---
<!-- page_number: true -->
# Thanks :thumbsup: