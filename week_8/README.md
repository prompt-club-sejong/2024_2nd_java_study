# Week 8 스터디
## 스터디 기간(과제 제출 기간)
24.11.05 ~ 24.11.19

## 스터디 주제
### README 스터디 내용 정리 세부 주제
- interface 정의하는 방법
- interface 구현하는 방법
- interface 레퍼런스를 통해 구현체를 사용하는 방법
- interface 상속
- interface Default Method (Java 8)
- interface static method (Java 8)
- interface private method (Java 9)

### 실습 내용
**WARNING: GPT 안돼요!!**

6주차에 배웠던 Dynamic Method Dispatch 구현해봅시다.

다음과 같이 `Payment`를 상속하여 결제 수단을 만든 뒤 이에 대해서 사용하는 예제를 작성해주시면 됩니다.
``` java
package payment;

public interface Payment {
    boolean pay(double price);
}
```
```java
package payment;

public class CreditCard implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("You paid by Credit Card");
        return true
    }
}
```

## 과제 완료 인원
|이름|닉네임|확인✔|
|---|------|----|
|김민우|[M1nu0x0](https://github.com/M1nu0x0)|✔|
|김서윤|[TomnJelly](https://github.com/TomnJelly)|✔|
|배현진|[hyunjin809](https://github.com/hyunjin809)|✔|

## 8주차 발표자
**[배현진](https://github.com/hyunjin809)**
