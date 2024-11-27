## 예외처리 (try, catch, throw, throws, finally)
 예외 처리는 코드 작성자가 예기치 않게 발생하는 에러들에 대응할 수 도록 사전에 방지하는 것이다. 예외 처리를 하면 프로그램의 비정상적인 종료를 방지하여 정상적인 실행 상태를 유지할 수 있다.
 
 try 블록은 예외가 발생할 가능성이 있는 범위를 지정하는 블록이다. try 블록은  최소한 하나의 catch 블록이 있어야 하며, catch 블록은 try 블록 다음에 위치한다.

 catch 블록의 매개변수는 예외 객체가 발생했을 때 참조하는 변수명으로 반드시 java.lang.Throwable 클래스의 하위 클래스 타입으로 선언되어야 한다. 지정된 타입의 예외 객체가 발생하면 try  블록의 나머지 문장들은 수행되지 않고, 자바 가상 머신은 발생한 예외 객체를 발생시키며 발생한 예외 객체 타입이 동일한 catch 블록을 수행한다.  
 

 finally 블록은 필수 블록은 아니다. finally 블록이 사용되면 finally 블록의 내용은 예외 발생 유무나 예외 catch 유무와 상관 없이 무조건 수행된다. 따라서, 데이터베이스나 파일을 사용한 후 닫는 기능과 같이 항상 수행해야 할 필요가 있는 경우에 사용한다.

 위 try, catch, finally가 예외 처리라면 throw, throws는 예외 던지기이다. throw는 예외를 강제로 발생시킨 후, 상위 블럭이나 catch문으로 예외를 던진다. throw를 사용하는 이유는 예외가 발생할 수 있는 코드가 있다는 것을 인지시키고 예외처리를 강요하며, 여러 가지 발생 가능한 예외들을 호출한 메서드에서 한 번에 처리할 수 있게 하여 관리를 용이하게 해 줄 수 있다.

 throws의 경우 메서드 내에서 예외처리를 하지 않고 해당 메서드를 사용한 곳에서 예외 처리를 하도록 예외를 위로 던지는 것입니다. 예외를 전가하는 것 입니다. 따라서 throws는 자신을 호출한 메서드에게 책임을 전가하여 호출한 메서드에서 예외처리를 하도록 강요한다.
***
## 예외 계층 구조
 자바에서는 예외가 발생하면 예외 클래스로부터 객체를 생성하여 해당 인스턴스를 통해 예외처리를 한다.   

 자바의 모든 에러와 예외 클래스는 Throwable 클래스로부터 확장되며, 모든 예외(Exception)의 상위 클래스는 Exception 클래스이다.   

 또한 Exception 클래스는 실행 예외 클래스(Runtime Exception)와 일반 예외 클래스(Other Exception)로 구분된다.
 <img assets = "./assets/exception_hierarchy.png">
***
## Exception과 Error의 차이
 예외(Exception)는 개발자의 잘못된 사용으로 인해 발생하는 에러는 상대적으로 약한 문제의 수준을 말한다. 즉, 개발자의 실수로 인해 발생하는 것이다. 이는 코드 수정을 통해 수습이 가능한 문제이다. 

 에러(Error)의 경우, 한 번 발생하면 복구하기 어려운 수준의 심각한 문제를 의미하고, 대표적으로 메모리 부족인 OutOfMemoryError와 스택 오버플로우(StackOverflowError)가 있다.

 자주 일어나는 오류 중에는 컴파일 오류와 런타임 오류가 있다. 컴파일 오류는 에러로 구분되고, 런타임 오류는 주로 예외로 분류되지만 일부는 에러로 간주된다.
 
 컴파일 오류는 소스코드를 .class 파일을 컴파일하는 과정에서 JVM이 던지는 오류로, 대부분 소스코드 자체의 문법적 오류로 인해 발생하는 경우이며, 프로그램 자체에서 처리할 수 있는 방법은 없다. 컴파일 오류의 예로는 ClassNotFoundException, IllegalAccessException, NoSuchMethodException 등이 있다.

 런타임 오류는 문법적인 오류가 없어 컴파일 시에는 정상적으로 컴파일됐지만 프로그램을 실행하는 과정에서 발생하는 오류를 말한다. 이는 개발자가 직접 오류를 확인하여 처리해야 한다. 런타임 오류의 예로는 NullPointerException, ArithmeticException, IndexOutOfBoundsException 등이 있다.
***
## RuntimeException과 RE가 아닌 것의 차이
RuntimeException은 unchecked Exception을 상속한 클래스이고, RuntimeException이 아닌것은 checked Exception을 상속한 클래스이다.   
 

RuntimeException을 상속한 예외들은 명시적인 예외처리를 강제하지 않기 때문에 따로 catch문으로 예외를 잡거나, throws로 선언하지 않아도 된다.   
 

RuntimeException이 아닌 것은 checkedException이 발생할 수 있기 때문에 반드시 예외를 처리하는 코드를 함께 작성해야 한다   
***
## 커스텀한 예외 만드는 방법
>일반 예외로 선언할 경우 Exception을 상속받아 구현   
실행 예외로 선언할 경우에는 RuntimeException을 상속받아 구현

사용자 정의 예외 클래스는 컴파일러가 체크하는 일반 예외로 선언할 수도 있고, 컴파일러가 체크하지 않는 실행 예외로 선언할 수도 있다.   

사용자 정의 예외 클래스 이름은 Exception으로 끝나는 것을 권장한다.   

사용자 정의 예외 클래스 작성 시 생성자는 매개 변수가 없는 기본 생성자, 예외 발생 원인(예외 메시지)을 전달하기 위해 String 타입의 매개변수를 갖는 생성자 두 개를 선언하는 것이 일반적이다.   

예외 메시지의 용도는 catch {} 블록의 예외처리 코드에서 이용하기 위해서이다.
***
## 참고 문헌 및 출처
[[Java] 자바 예외 처리(Exception Handling) 개념 정리 및 활용](https://ittrue.tistory.com/140)   
[자바 예외 처리(try catch) 문법 & 응용 정리](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%98%88%EC%99%B8-%EC%B2%98%EB%A6%ACException-%EB%AC%B8%EB%B2%95-%EC%9D%91%EC%9A%A9-%EC%A0%95%EB%A6%AC)   
[[Java]Error와 Exception](https://choiblack.tistory.com/39)    
[Java 예외 처리(Exception) 와 예외 던지기 (throw, throws)](https://day0404.tistory.com/47)
[[Java] 자바 커스텀 예외 만들기(Custom Exception)](https://veneas.tistory.com/entry/Java-%EC%BB%A4%EC%8A%A4%ED%85%80-%EC%98%88%EC%99%B8-%EB%A7%8C%EB%93%A4%EA%B8%B0Custom-Exception)