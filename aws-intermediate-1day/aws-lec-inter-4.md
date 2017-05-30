![70%](images/img_blue.png)
# AWS 중급 코스: 4교시 
## 중요 서비스들의 기능 더 살펴 보기 
### CodeSquad

---
# Cloud Watch
- AWS 리소스의 모니터링 서비스 
- 관리 콘솔 및 CLI, SDK 모두에서 사용 가능 
- 기본 제공 메트릭 외에도 사용자 정의 메트릭 측정치도 수집 가능 

--- 
# Cloud Watch
- namespace 로 묶어서 관리
- 같은 namespace를 dimension으로 분리 가능 

--- 
# Cloud Trail 
- AWS 계정의 변화를 모니터링
- S3 버켓에 계정 접근 로그 저장
- 정상적인 접근, 비정상적인 접근 모두 감지


--- 
# Cloud Watch Logs 
- EC2 인스턴스 및 중요 로그를 AWS에 저장
- 비용이 저렴하며, 안정성, 확장성이 우수
- agent 프로그램 설치 필요 
    - User data, cloud formation 활용
- 간단한 로그 통계 및 알람 기능도 유용 
---
# Cloud Watch Logs 
- ec2 인스턴스에 아래와 같은 권한 필요 
```
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Effect": "Allow",
      "Action": [
        "logs:CreateLogGroup",
        "logs:CreateLogStream",
        "logs:PutLogEvents",
        "logs:DescribeLogStreams"
    ],
      "Resource": [
        "arn:aws:logs:*:*:*"
    ]
  }
 ]
}
```
---
# Cloud Watch Logs 사용해 보기
```
sudo yum update -y
sudo yum install -y awslogs
sudo service awslogs start
# /etc/aws/logs/awslogs.conf 편집
sudo chkconfig awslogs on
```
---
# S3 versioning + lifecycle 
- S3 저장소의 데이터들을 클래스 및 수명주기를 효율적으로 관리
- 비용, 보안 측면에서 관리 비용 감소
- version 객체별로 다른 권한 지정 가능 


---
# AWS SNS를 활용한 Billing Alarm 설정하기
- 1 cent부터 설정 가능 ($.01) 
- SMS또는 slack과 연동도 가능 
- 프리 티어의 경우 반드시 설정하자 

---
# DynamoDB
- AWS의 완전 관리형 NoSQL DB
- 고성능, 내구성, 사용이 편리 
- 글로벌 동기화 등도 구성 가능 
ex) Supercell - 클래시 로얄 
https://aws.amazon.com/ko/solutions/case-studies/supercell/
https://aws.amazon.com/ko/solutions/case-studies/scopely/
- SDK가 있지만 개발은 ...

---
# AWS Lambda 
- Serverless Computing Service
- 메모리 사용량 + 실행시간 기반으로 비용 청구
- 짧게 실행하는 응용 프로그램 사용시 매우 저렴
- ex) 썸네일 생성 
- AWS의 다른 관리형 서비스와 연동시 서버리스 서비스 구성도 가능 

---
# SQS
- AWS queue 서비스 
- SNS 와 연동도 가능 

---
# Route53
- DNS 서비스
- 다양한 라우팅 정책 지원
    - Simple routing
    - Latency Based Routing
    - Weight Based Round Robin
    - Failover Routing
    - 지리 기반 라우팅

- 장애 복구 / 배포 등에 다양한 응용 가능 

---
# Route53 Blue / Green Deploy
![](https://cdn-images-1.medium.com/max/800/1*qFx_tdqw3G5rEuZ0rdAH4A.jpeg)

---
# Cloud Formation
- 인프라를 템플릿으로 기술 
- 똑같은 인프라를 여러 리전에 만들 수 있음
- DevOps 적용시 핵심기술 
- NASA, MLB, 슈퍼볼, 올림픽 방송 등에 사용 
- 빠르게 인프라 생성 및 삭제 가능
ex) 1주일에 4시간 하둡 10대 사용시 

---
# Cloud Front
- CDN 서비스 
- S3와 연동해서 사용하는 경우가 많음
- 
---
# ElasticBeanstalk
- 개발자를 위한 서비스
- 빠른 배포가 가능
- 인프라 관리 부담이 거의 없음
- Heroku와 유사한 서비스 
---
# OpsWorks
- AWS Managed Chef 서비스
- 수천대의 인프라를 쉽게 관리 
- 서버관리 및 배포 부담을 덜어 줌

---
# 기타
- AWS kinesis
- Cloud Search
- Elastic Search
- Athena
- Cognito 
- API gateway 
- CloudFront
- ...

---
# 공부하면 좋은 것들 
- AWS 공식 블로그
  https://aws.amazon.com/ko/blogs/aws/

- 넷플릭스 기술 블로그 
http://techblog.netflix.com/
- 