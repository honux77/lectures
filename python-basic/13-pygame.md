# ![70%](images/img_white.png)
# Python Basic
## pygame
CodeSquad

---
# python으로 게임 만들기
- 생각보다 쉽다.
- 아이들이 좋아한다.
- 기타 등등

---
# 많이 사용하는 게임 라이브러리
- unity, unreal, anarchy, ...
- cocos2d, pygame, PyQt, kivy
- create.js
- MIT Scratch, Entry

http://loderunnerwebgame.com/game/

---
# pygame init
```
import sys, math
import pygame
from pygame.color import THECOLORS

pygame.init()
screen = pygame.display.set_mode([640,480])

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
pygame.quit()
```

---
# draw
<pre style="font-size:.8em">
import pygame
pygame.init()
screen = pygame.display.set_mode([640,480])

screen.fill([255, 255, 255])
pygame.draw.circle(screen, [255, 0, 0], [100, 100], 30, 0)
pygame.display.flip()
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
pygame.quit()
</pre>

---
# 그래프 그리기
<pre style="font-size:.8em">
points=[]
for x in range(0,640):
    y = 300 - int(math.sin(x/640 * 2 * math.pi)* 100)
    points.append([x, y])
pygame.draw.lines(screen, THECOLORS['black'], False, points, 2)
</pre>


---
# 게임의 동작 원리

- 메인 루프
- 더블 버퍼링
- 이벤트 처리

---
# 이미지 불러오기
```
bg = pygame.image.load('assets/bg.jpg')

screen.blit(bg, [0,0])

```

---
# 움직이기
<pre style="font-size:.5em">

import pygame, sys
from pygame.color import THECOLORS
import math

pygame.init()
screen = pygame.display.set_mode([640,480])

bg = pygame.image.load('assets/bg.jpg')

ball_pos = [50, 50]
speed = [2, 2]

# screen.fill([255, 255, 255])
# pygame.draw.rect(screen, THECOLORS["blue"], [270,200, 30,280], 0)

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    pygame.time.delay(17)

      # move
    ball_pos[0] += speed[0]
    ball_pos[1] += speed[1]

    screen.blit(bg, [0, 0])

    pygame.draw.circle(screen, THECOLORS["red"], ball_pos, 30, 0)

    pygame.display.flip()

pygame.quit()
</pre>


---
# 공 튕기기

<pre style="font-size:.5em">
    bsize = 30 #ball size
    pygame.draw.circle(screen, [255, 0, 0], [100, 100], bsize, 0)
    # ...

    if not (bsize < ball_pos[0] < screen.get_width() - bsize):
        speed[0] = -speed[0]
    if not (bsize < ball_pos[1] < screen.get_height() - bsize):
        speed[1] = -speed[1]
</pre>

---
# 배경 흐르게 하기
```
bg = pygame.image.load('assets/bg.jpg')
bgx = 0
bg_speed = -3

# ...

    bgx += bg_speed
    if bgx <= -screen.get_width():
        bgx = 0
    bgx2 = screen.get_width() + bgx
    screen.blit(bg, [bgx, 0])
    screen.blit(bg, [bgx2, 0])
```
