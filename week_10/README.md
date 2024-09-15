# Week 10 스터디
## 스터디 기간(과제 제출 기간)
24.12.02 ~ 24.12.06

## 스터디 주제
### README 스터디 내용 정리 세부 주제
- Thread Class와 Runnable Interface
- Thread의 상태
- Thread의 우선 순위
- Main Thread
- 동기화
- 데드락

### 실습 내용
**WARNING: GPT 안돼요!!**

아래 예시와 같이 Thread가 여러개 겹치는 상황에 대해서 어떻게 동작하는지 예상해 본 다음 실험해봅시다.

```java
public class ThreadExample {
    public static void main(String[] args) throws Exception {
        Thread thread = new MyThread();

        // thread 스레드 실행
        thread.start();

        // main 스레드 동작
        for (int i=0; i<10; i++) {
            System.out.println("Main");
        }
    }
}
```

## 과제 완료 인원
|이름|닉네임|확인✔|
|---|------|----|
|김민우|[M1nu0x0](https://github.com/M1nu0x0)|✔|

## 10주차 발표자
**[발표자](https://github.com/발표자)**
