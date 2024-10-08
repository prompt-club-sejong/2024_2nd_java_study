# Week 4 스터디

## if
조건문이란 개발자가 작성한 코드를 조건에 따라 코드의 실행 흐름을 다르게 동작하도록 제어하는 것이라고 할 수 있다. 조건문의 종류는 크게 if문 switch문 2가지로 구분할 수 있다. 조건이 하나일 결우 if문을 사용한다. 

if문은 조건식의 결과가 true 혹은 false냐에 따라 실행여부가 결정된다. 따라서 조건식에는 true나 false값을 산출할 수 있는 조건식이나 boolean타입 변수가 올 수 있다. 조건식이 true일 때는 블록을 실행하고 false일 때는 블록을 실행하지 않는다.   

    if(조건식){
        실행문;
        ...
    }


if-else문은 조건이 2개일 경우 사용한다.

    if ( 조건식 ) {
        실행문A    // 조건식이 true이면 A → C 실행
    } else {
            실행문B  // 조건식이 false이면 B → C 실행
    }
    실행문C

if-else if- else문은 조건문이 여러 개일 경우 사용한다.

    if ( 조건식1 ) {
        실행문A     // 조건식1이 true이면 A → D 실행
    } else if (조건식2) {
        실행문B     // 조건식1이 false이면 조건식2로 이동
                    //조건식2가 true이면 B → D 실행
    } else {
        실행문C     //조건식2가 false이면 C → D실행
    }
    실행문D
    
if else문의 수는 제한이 없으며 여러 개의 조건식 중 true가 되는 블록만 실행하고 전체 if문을 벗어나게 된다. else if문 블록의 마지막에는 else 블록을 추가할 수 있는데 모든 조건식이 false일 경우 else블록을 실행하고 if문을 벗어나게 된다.

다중 if문은 if문 안에 if문이 또 있는 경우를 말한다. 안에 있는 if는 조건1과 조건2가 모두 충족해야 한다.

    if( 조건1 ) {
        if( 조건2 )  {
                    // 조건1&&조건2와 같음 
        } else{
                    // 조건1이 true여도 조건2가 false면 else 
        }           
                    // 조건1이 false면 else
    }

## switch/case
switch문은 if문과 다르게 true일 경우에 블록 내부의 실행문을 실행하는 것이 아니라, 변수가 어떤 값을 갖느냐에 따라 실행문이 결정된다. if문은 조건이 많아질 수록 else-if를 통해 계속해서 추가해주어야 하지만 switch문은 변수의 값에 따라 실행문이 결정되기 때문에 같은 기능의 if문 보다 코드가 간결하다.

괄호 안의 변수값과 동일한 값을 갖는 case로 가서 실행문을 실행한다.
만약 괄호 안의 변수 값을 갖는 case가 없다면 default로 가서 실행문을 실행하는데 default는 생략이 가능하다. default 실행 후 switch문 종료한다.

switch문에서 주의할 점은 case블록 마지막에 break; 를 반드시 작성해야 한다. break문은 만나면 switch문을 즉시 종료한다. 다음에 있는 case를 실행하지 않고 switch문을 빠져나오기 위해 사용한다. break가 없다면 다음에 있는 case가 계속 실행되며 이때는 case값과 상관없이 실행된다.

*default는 break가 없다.

    switch ( 변수 ) { case 값1: 실행문A     // 변수가 값1인 경우 실행문A 실행
    break;
    case 값2:
        실행문B    // 변수가 값2인 경우 실행문B 실행
    break;
    default:
        실행문C    //변수가 값1, 값2 모두 아닌 경우 (나머지 처리문) 실행문C 실행
    }


## while
조건문으로서 특정 조건에 따라 반복하여 수행할때 사용한다. 단, 초기값 없이 조건문만 명시하여 반복한다.
한번 반복할때마다 조건문을 체크하여 false이면 반복을 중단한다.

    while(조건문){
        //연산문
    }

do while은 do를 한 이후 while작업을 진행한다.

    int number = 0;
    do{
        number++;
        System.out.println(number + " 출력");
    } while (number < 3);
        
break   
break; 명령을 내리면 가장 가까운 블럭의 for문 또는 while, switch 문을 중단한다.

continue   
for문 또는 while 문에서 해당 순서를 패스하고 싶을 때 사용한다. 반복문 안에서 continue; 형태로 사용한다.


## for / for each
기본 for문의 구조이다. 

초기화 : 반복문(for)에서 사용될 변수를 초기화   
조건식 : 조건식의 값이 True이면 계속 반복, False이면 반복을 중단하고 for문 탈출   
증감식 : 반복문(for)을 제어하는 변수의 값을 증가(+) 또는 감소(-)시키는 식이다.

    for (초기화; 조건식; 증감식) {
        	// 조건식이 True일 때 수행될 문장 작성
    }

for each   
for each라는 키워드가 따로 있는 것은 아니고 동일한 for문을 이용한다. 추가로 for each와 forEach는 같은 것은 아니다. 

        // 기본 for문
        for (int i=0; i<list.size(); i++) {	
        System.out.println(list.get(i));
        } 
        
        //for each문
        for(String str : list) {	
            System.out.println(str);
        }
for each문은 보기에 매우 직관적이고, 구조를 살펴보자면 iterate는 Loop를 돌릴 객체다. iterate 객체에서 1개씩 순차적으로 var에 대입되어 for문이 수행되고, iterate로 사용할 수 있는 자료형(Type)은 Loop를 돌릴 수 있는 자료형(배열, ArrayList 등)만 가능하다. 단, 향상된 for문은 따로 반복 횟수를 명시적으로 주는 것이 불가능하고, 1개씩 순차적으로 반복될 때만 사용 가능하다.

forEach()   
forEach() 메서드는 Java8에서 추가된 Iterable 인터페이스의 기본 메서드다. 기존 for문과 비슷하게 조금 더 쉽게 Loop를 가능하게 해주는 메서드다. Consumer*이라는 인터페이스를 전달받아 내부적으로 accept라는 메서드를 실행하도록 구조가 되어 있다.
    
    @FunctionalInterface
    public interface Consumer<T> {	
        void accept(T t);
    }

*Consumer 인터페이스 : 함수형 인터페이스*(Functional Interface)의 한 종류로 아래와 같이 선언되어 있다.
*함수형 인터페이스 :함수형 인터페이스(Functional Interface)는 추상 메서드(Abstract Method)를 딱 1개만 가지고 있는 인터페이스 혹은
@Functionalinterface 어노테이션을 붙인 인터페이스를 말한다. 혹은 SAM(Single Abstract Method)라고도 부른다.핵심은 static 메서드와 default 메서드가 인터페이스 안에 존재하더라도 추상 메서드가 1개만 존재하면 함수형 인터페이스다.
## Java 13. switch (hint: lambda)
Java8 버전 이전에는 인터페이스를 구현하는 방법은 구현 클래스를 통한 방법, 익명(Anonymous) 구현 객체를 통한 구현이 대표적이었지만 
하지만 Java8 버전부터는 추상 메서드를 1개만 가지고 있는 함수형 인터페이스를 람다 표현식으로 작성할 수 있다. 람다 표현식을 사용하면 코드를 줄이고 가독성을 높일 수 있다.

Java에서 람다 표현식(Lambda Expression)은 함수형 인터페이스를 인라인(InLine)으로 구현한 특수한 형태의 객체이기 때문에 레퍼런스에 할당이 가능하고, 메서드의 파라미터로 전달할 수 있고, 메서드의 반환 값으로 넘길 수 있다.

종합해서 말하자면 람다 표현식은 
1. 함수형 인터페이스의 인스턴스를 만드는 방법으로 사용 가능하다.
2. 코드를 줄이고, 가독성을 높일 수 있다.
3. 메서드 매개 변수, 리턴 타입, 변수로 만들어 사용 가능하다.

(인자 리스트) -> { body }로 표현한다.
* 인자 리스트

    인자가 없을 때 : ( )   
인자가 1개일 때 : (one) 또는 one으로 괄호() 생략 가능   
인자가 여러 개일 때 : (one, two) 괄호 생략 X   
인자의 타입(Type)은 생략 가능 / 컴파일러가 추론(infer)하지만 명시할 수도 있다. (Integer one, Integer two)   


* Body(바디)

    화살표(->) 오른쪽에 함수 본문을 정의   
    여러 줄인 경우 { }를 사용해서 묶는다.   
    1줄인 경우 { }를 생략 가능하며, return 또한 생략 가능하다.   

    
    >Function<Integer, Integer> plus10 = (input) -> {   
        return input + 10;   
    };

## 참고 문헌 및 출처
[[자바/JAVA] 조건문(if, switch, if-else, else, break)에 대해 알아보자](https://velog.io/@luna001631/%EC%9E%90%EB%B0%94JAVA-if%EB%AC%B8%EA%B3%BC-switch%EB%AC%B8%EC%97%90-%EB%8C%80%ED%95%B4-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90-%EC%98%88%EC%A0%9C)   
[[JAVA/자바] 조건문(if문, if else문, else if문)](https://blog.naver.com/heartflow89/220947423870)   
[[Java] for문의 종류 - for, 향상된 for, forEach()
](https://backendcode.tistory.com/221)   
[[Java8] 함수형 인터페이스, 람다 표현식](https://backendcode.tistory.com/214)   
[[JAVA/자바] while문, do~while문](https://blog.naver.com/heartflow89/220949843867)   
[[JAVA 문법 종합반 3일차-while, break, continue]](https://velog.io/@dk_ovo/JAVA-%EB%AC%B8%EB%B2%95-%EC%A2%85%ED%95%A9%EB%B0%98-3%EC%9D%BC%EC%B0%A8-while-break-continue)