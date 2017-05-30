# ![30%](images/img_white.png)
# Python Basic
## 9. 간단 슬랙 봇 
CodeSquad

---
<!-- page_number: true -->
# 슬랙 설정 
## 팀 만들기
slack.com - Create a new team 선택
이메일 인증 등의 절차를 거쳐 새로운 슬랙 팀 생성

## 채널 만들기
팀 슬랙에 로그인 후 새로운 채널 생성 
- ex) `#test` 

---
# incomming WebHooks 설정 

- 가장 간단한 형태의 봇 
- 특정 채널에 짧은 메시지를 보낼 수 있음 

- custom command (ex: `/open window`)나 채널 이벤트의 응답 등은 처리할 수 없음 


- https://honuxme.slack.com/apps 에서 검색 또는

- https://honuxme.slack.com/apps/A0F7XDUAZ-incoming-webhooks


---
##  webhook 설정 

채널 등을 설정하고 나오는 URL을 저장 

> https://hooks.slack.com/services/1234ABCDEZZ...

---
## 보내기 
<pre style="font-size:.6em">
import simplejson as json
import requests

webhook_url = 'hookhook"

msg = {
    "attachments": [
        {
            "pretext": "message from honux-bot",
            "title": "안녕하세요?",
            "title_link": "http://codesquad.kr",
            "text": "서버로부터 온 메시지입니다.",
            "color": "#7CD197"
        }
    ]
}

response = requests.post(
    webhook_url, data=json.dumps(msg),
    headers={'Content-Type': 'application/json'})

if response.status_code != 200:
    raise ValueError(
        'Request to slack returned an error %s, the response is:\n%s'
        % (response.status_code, response.text)
    )


</pre>
---
## 응용 

30초마다 스프레드시트의 특정 셀에 변경이 일어날 경우를 체크하고 슬랙 메시지를 보내는 봇 프로그램을 작성해 보세요.

