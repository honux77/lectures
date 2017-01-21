<!-- page_number: true -->
![30%](images/slogo.png) ![30%](images/stove.png) 
# Learn Linux Command
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung <br>
</p>

<p align='right'><img src='images/logo.png' width = '15%'> </p>

---
<!-- page_number: true -->
# History
1. 1969년 켄 톰슨과데니스리치가 벨 연구소에서 유닉스 OS를 만듬
2. 1991년 라이너스 토발즈라는 대학생이 Linux 커널을 만듬

---
<!-- page_number: true -->
# 리눅스 배포판 선택
1. 리눅스에는 다양한 배포판이 존재함
	- 배포만들은 각각 자신만의 프로그램 관리 도구가 있음
	- Debian (www.debian.org)
	- Ubuntu (www.ubuntu.org)
    - Redhat Enterprize Linux
    - Fedora
    - Cent
    - Mint Linux
    - Gentoo
    - Arch Linux
    - Open SUSE :thumbsup: 

---
<!-- page_number: true -->
# 실습 준비
## windows 환경에서 AWS를 이용한 접속
1. aws ec2 - ubuntu 16.04 - t2.micro 생성
	- 생성시 보안 그룹 설정에 주의
2. putty, puttygen 다운로드
3. aws ec2 인스턴스 접속하기
	- userid: ubuntu
	- IP: EC2의 public IP 이용

http://docs.aws.amazon.com/ko_kr/AWSEC2/latest/UserGuide/putty.html


---
<!-- page_number: true -->
# 접속 후 우분투 설정 
```
$ sudo apt-get update
$ sudo apt-get upgrade
$ sudo apt-get install language-pack-ko
```

---
<!-- page_number: true -->
한글 설정 

$HOME/.bashrc에 추가
```
LANG="ko_KR.UTF-8"
LANGUAGE="ko_KR:ko:en_US:en"
```
저장 후 bash에서
```
$ source ~/.bashrc
$ locale
$ env
```

---
<!-- page_number: true -->
# Shell
Shell(쉘, 셸)이란?
   - OS와 대화하는 프로그램
   - 여러 가지 종류가 있는데 지금은 bash사용
   - 맥 사용자는 zsh를 사용하는 것도 좋다! (oh-my-zsh)


---
<!-- page_number: true -->
# pwd
현재 디렉토리를 확인

# tree
트리 모양으로 표시 
```bash
$ sudo apt-get install tree
$ tree /home/
```

---
<!-- page_number: true -->
# mkdir
새로운 디렉토리 생성

# cd
디렉토리 이동 

```bash
$ mkdir honux
$ ls
$ pwd
$ cd honux
$ ls
```

---
<!-- page_number: true -->
# ls
List Directory, 디렉토리의 내용을 보여줌
```bash
$ ls -l
$ ls -al
$ ll
```
. 은 현재 디렉토리
.. 은 현재 디렉토리의 부모 디렉토리를 나타낸다.
zsh의 경우는 아래처럼도 사용가능
```
$ cd ...../
```

---
<!-- page_number: true -->
# cat 파일이름
파일 내용 표시
```bash
$ echo "Hello, CodeSquad?" > hello.txt
$ cat hello.txt
$ echo "Fine, thank you" >> hello.txt
$ cat hello.txt
```

---
<!-- page_number: true -->
# less 파일명
긴 파일의 내용을 끊어서 표시
   - q: 종료
   - g: 처음으로
   - G: 끝으로
   - /단어: 문서에서 '단어'를 검색
   - space, enter, 화살표, hjkl: 페이지 이동

---
<!-- page_number: true -->
# history
명령어 이력 표시
```bash
$ history
$ !명령어번호

```

---
<!-- page_number: true -->
# cp, mv, rm
파일 복사, 이동, 삭제
```
$ mkdir dir1
$ echo "some" > dir1/file.txt
$ cp dir1/file.txt file2.txt
$ cp -a dir1 dir2
$ ls -R
$ mv dir2 dir3
$ rm -rf dir1
```

---
<!-- page_number: true -->
# find 디렉토리 -name "파일이름"
지정한 디렉토리와 그 하위디렉토리에서 해당 파일을 검색한다.

---
<!-- paœge_number: true -->
# touch 파일이름
0바이트 파일 생성
```bash
$ touch foo.txt
$ ls
```

---
<!-- paœge_number: true -->
# man
도움말 보기

# alias
단축 명령 등록


---
<!-- paœge_number: true -->
# 기타 유용한 도구들
## htop
## tmux 
## zsh
## vim plugin
- vundle
- nerd-tree

---
<!-- paœge_number: true -->
# 도전 과제
1. zsh 설치
2. oh-my-zsh 설치
3. 테마 agnoster로 변경하기 
4. 추가 플러그인 설치
	- zsh-autosuggestion
---
<!-- paœge_number: true -->
# 더 공부하기
- http://linuxcommand.org/lc3_learning_the_shell.php
- https://linuxjourney.com/
- https://www.edx.org/course/introduction-linux-linuxfoundationx-lfs101x-0
