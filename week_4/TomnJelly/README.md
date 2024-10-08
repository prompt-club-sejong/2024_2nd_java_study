# Week 4 스터디
## 스터디 기간(과제 제출 기간)
24.09.24 ~ 24.10.08

## 스터디 주제
### README 스터디 내용 정리 세부 주제
- if
  if(조건문){
  System.out.println("True or False");
}
- switch/case
switch(입력변수){
  case 입력값1: ...
    break;
  case 입력값2: ...
    breakl;
  ...
  default:...
    break;
}
입력변수의 값과 일치하는 case 입력값이 있다면 해당 case문에 해당하는 문장이 실행된다
case문마다 break라는 문장이 있는 이유는 해당 case문을 실행하고 switch문을 빠져나가기 위한 것이다
입력값에 해당하지 않는 값이 들어오면 그때 default에 있는 문장이 실행

- while
while(조건문){
  System.out.println("조건문이 거짓이 될때까지 while문 안의 문장을 실행");
}

무한루프를 break를 사용해서 종료할 수도 있다
continue를 사용할 수도 이는데 이때는 보통 어떤 조건을 검사해서 while문을 빠져나가는 대신
while문의 조건문으로 다시 돌아가게 하기도 한다

- for / for each
  
  for: for(초기치; 조건문; 증가치)
  
  for each: for(type 변수명: iterate){
    body-of-loop
  }
  iterate는 루프를 돌릴 객체이고 iterate 객체에서 한 개씩 순차적으로 변수명에 대입되어 for문이 수행
  iterate에 사용할 수 있는 자료형은 루프를 돌릴 수 있는 자료형(배열이나 ArrayList 등)만 가능

- Java 13. switch (hint: lambda)
  Java12 이상부터 람다 문법을 switch에서 사용 가능
  화살표(->) 연산자를 사용하여 yield 키워드 없이 변수에 구문의 결과를 저장할 수 있다

  기존의 switch문은 break문이 불필요하게 많다
  case 변수1:
    System.out.println(1);
    break;
  case 변수2:
    System.out.println(2);
    break;

  바뀐 switch문
  case 변수1 -> System.out.println(1);
  case 변수2 -> System.out.println(2);


### 실습 내용
**WARNING: GPT 안돼요!!**

사용자로부터 입력 받는 숫자로 구구단을 출력하는 프로그램을 작성해봅시다. 다음은 예시 출력입니다.

```
Multiplication Table
You can exit the program by entering 0

Enter the number: {2}
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18

Enter the number: {0}
Program exited successfully
```

## 과제 완료 인원
|이름|닉네임|확인✔|
|---|------|----|
|김민우|[M1nu0x0](https://github.com/M1nu0x0)|✔|
|김서윤|[TomnJelly](https://github.com/TomnJelly)||
|배현진|[hyunjin809](https://github.com/hyunjin809)||

## 4주차 발표자
**[발표자](https://github.com/발표자)**
