# Week 7 스터디
## 스터디 기간(과제 제출 기간)
24.11.05 ~ 24.11.19

## 스터디 주제
### README 스터디 내용 정리 세부 주제
- package 키워드
  모든 클래스는 정의된 클래스 이름과 패키지 이름이 있다. FQCN = 클래스의 패키지 + 클래스 이름
  String 클래스의 패키지 : java.lang, FQCN : java.lang.String   
  패키지가 상, 하위로 구분되어 있다면 도트( . )를 사용하여 표현한다.
  비슷한 성격의 자바 클래스들을 모아서 폴더 단위로 관리하기 때문에 유지 보수가 용이해진다.

- import 키워드
  패키지를 사용하고자 할 때 해당 패키지를 가져오는 방법으로 'import 패키지명.클래스명' 형태로 사용한다.   
  특정 패키지안에 다수의 클래스를 import 해야하는 경우 'import 패키지명.*' 형태로 사용한다.   
  같은 패키지의 클래스들은 import 하지 않아도 된다.

- 클래스패스
  클래스를 찾기 위한 경로이다. JVM이 프로그램을 실행할 때, 클래스 파일을 찾는데 기준이 되는 파일 경로를 말한다. 
  classpath를 지정하기 위해 두가지 방법이 있다. 
  1. CLASSPATH 환경변수 사용
  2. java runtime 시에 -classpath 옵션 사용 

- CLASSPATH 환경변수
  컴퓨터 시스템 변수 설정을 통해 지정할 수 있는데 JVM이 시작될 때JVM의 클래스로더가 이 환경변수를 호출한다.   
  환경변수에 지정된 디렉토리가 호출되면 그 디렉토리에 있는 클래스들을 먼저 JVM에 로드하기 때문에 CLASSPATH 환경변수에는 필수 클래스들이 위치한 디렉토리를 등록하도록 해야 한다.

- -classpath 옵션
 컴파일러가 컴파일 하기 위해 필요로 하는 참조 클래스 파일들을 컴파일시 파일 경로를 지정하는 것이다.    
  javac '참조패키지1;참조패키지2...' '클래스파일'     
  ex : javac -classpath C:\java\test1 C:\java\Hello.java   
  ex : javac -classpath C:\java\test1;C:\java\test2 C:\java\Hello.java   
  classpath 대신 단축어인 cp를 사용할 수 있다.

- 접근지시자
  클래스, 필드, 메서드 단위로 외부에서 접근 가능한 범위를 설정하는 것을 말한다.   
  다른 표현으로는 접근 제한자(Access Modifier), 접근 수준 지시자(Access-level Modifier) 라고도 한다.   
  외부에서 접근 가능한 범위를 설정하기 때문에 아래와 같은 기능을 하게 된다.   
  1. 객체 생성을 막기 위해 생성자를 호출하지 못하게 한다.
  2. 객체의 특정 데이터를 보호하기 위해 해당 필드에 접근하지 못하게 한다.
  3. 특정 메서드를 호출할 수 없도록 제한하는 기능을 한다.

- 접근 지시자 종류
  public   
    모든 패키지에서 아무런 제한 없이 호출할 수 있게 한다.   
  protected   
    default 접근 제한과 마찬가지로 같은 패키지에 속하는 클래스에서 호출할 수 있도록 한다.   
    차이점은 다른 패키지에 속한 클래스가 해당 클래스의 하위 클래스라면 호출 할 수 있다.   
  package-private (default)   
    접근 제한자를 명시하지 않았다면 default 접근 제한을 가진다.   
    같은 패키지에서는 제한 없이 호출할 수 있으나, 다른 패키지에서는 호출할 수 없다.   
  private   
    클래스 내부에서만 사용할 수 있다.   

- 참고 문헌 및 출처
  [[JAVA]자바 package](https://codingwell.tistory.com/72)   
  [Java-package 키워드, import 키워드와 접근제어자(Access Modifier)](https://jddng.tistory.com/187)    
  [접근 지시자(Access Identifier)](https://beststar-1.tistory.com/18)
