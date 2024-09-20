# 2024년 Prompt! 2기 Java 스터디 모임
2024년 2학기 자바 스터디 레포지토리

## 스터디 개요
총 10주 구성 (24.09.16~24.12.06)
- [1주차](/week_1/) : 24.09.16 ~ 24.09.20
- [2주차](/week_2/) : 24.09.23 ~ 24.09.27
- [3주차](/week_3/) : 24.09.30 ~ 24.10.04
- [4주차](/week_4/) : 24.10.07 ~ 24.10.11
- [5주차](/week_5/) : 24.10.28 ~ 24.11.01
- [6주차](/week_6/) : 24.11.04 ~ 24.11.08
- [7주차](/week_7/) : 24.11.11 ~ 24.11.15
- [8주차](/week_8/) : 24.11.18 ~ 24.11.22
- [9주차](/week_9/) : 24.11.25 ~ 24.11.29
- [10주차](/week_10/) : 24.12.02 ~ 24.12.06

## 스터디 인원
|이름|GitHub 닉네임|R&R|
|---|---|---|
|김민우|[M1nu0x0](https://github.com/M1nu0x0)|스터디 장|
|김서윤|[TomnJelly](https://github.com/TomnJelly)|스터디 원|
|배현진|[hyunjin809](https://github.com/hyunjin809)|스터디 원|

## 스터디 참여 방법
### Step.1 Java Study Repo Fork.
자바 스터디 과제 제출을 위해 해당 Repo를 자신의 Repo로 Fork한다.
![캡처](/img/step1-1.png)
![캡처](/img/step1-2.png)

### Step 2. Local Git Clone. ([Git 사전 설치 필수](https://sfida.tistory.com/46))
자신의 Repo로 복제한다.
![캡처](/img/step2-1.png)
![캡처](/img/step2-2.png)

#### Step 2.1. Local Git Clone with VSCode.
VSCode에서도 git clone을 할 수 있다.
![캡처](/img/step2-3.png)

### Step 3. 과제 작성.
#### Setp 3.1. 폴더 구조
복제 후, VS Code를 통해 폴더를 연다.
![캡처](/img/step2-4.png)
`week_x` 폴더 하위에 자기 GitHub Nickname으로 폴더 생성후, README.md 파일 작성.
```
{/root}
├── week_x
├── README.md       // 과제 설명
├── /M1nu0x0
│   ├── /assets     // 본인 과제에 사용할 이미지
│   │   ├── img1.png
│   │   ├── img2.png
│   ├── /src        // 본인 소스코드 넣는 곳
│   │   ├── HelloWorld.java
│   │   ├── /{package-path}
│   ├── README.md   // 과제 본문
```
과제에 img를 넣어야한다면 assets 폴더에 이미지 저장 후 `![name](/assets/img.png)` 문법으로 삽입.

코드 제출은 src 폴더에 하기.

#### Step 3.2. Commit
과제 완료 후 Commit 메세지 작성 후 커밋.
![캡처](/img/step3-1.png)
![캡처](/img/step3-2.png)
Commit 완료 후 원격 저장소(Remote Repo)에 Push.
![캡처](/img/step3-3.png)

### Step 4. Pull Request 생성.
Push한 자신의 GitHub Repo로 이동. ahead된 commit이 있는 지, 확인 후 PR(Pull Request).
![캡처](/img/step4-1.png)
![캡처](/img/step4-2.png)
![캡처](/img/step4-3.png)
### Step 5. Code Review.
스터디 장이 PR로 Open된 Issue 하단에 과제한 내용에 Comment를 달고, 일정 정도 과제 완성도 이상 시, Merge 수행. 
![alt text](/img/step5-1.png)
