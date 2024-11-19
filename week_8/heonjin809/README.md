## 스터디 주제
### README 스터디 내용 정리 세부 주제
- interface 
  다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개체 역할까지 담당하는 추상 클래스보다 추상적인 추상 클래스를 의미한다.   
  자바8 이전에는 상수,추상 메소드만 정의할 수 있었지만, 자바8 이후로는 default , static , private method가 추가되었다.    
  추상 클래스와 인터페이스의 차이는 먼저 추상클래스는 일반 메소드와 추상 메소드를 가질 수 있지만 인터페이스는 추상메소드만 가질 수 있다.(자바8 이후 : static, default, private method 포함)  
  또한 추상 클래스와 달리 인터페이스에선 변수와 메소드에 기본적으로 선언되는 것이 있다. 변수 : public static final, 메소드 : public abstract
  
- interface 정의하는 방법
  인터페이스를 정의할 때는 접근 제어자와 함께 interface 키워드를 사용하면 된다.   

  접근제어자 interface 인터페이스명 {      
    public static final 타입 상수이름 = 값;   
    타입 상수이름 = 값;   

    public abstract 메소드명(매개변수 );   
    }   
클래스와 달리 인터페이스의 모든 필드는 public static final 이어야 하며 모든 메소드는 public abstract 이어야한다.   
- interface 구현하는 방법
  인터페이스는 클래스에서 implements 키워드를 통해 구현할 수 있다.
  ex : public class 클래스명 implements 인터페이스명{   
        }

- interface 레퍼런스를 통해 구현체를 사용하는 방법
  인터페이스는 구현체를 통해서 인스턴스 생성이 가능하기 때문에 인터페이스에서 정의되지 않았으면 캐스팅을 해야 사용이 가능하다.   
  ex :   
package LiveStudy._8Week;

public interface Animal {
    public abstract void cry();
}

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("멍멍!");
    }

    public void name() {
        System.out.println("Milk");
    }
}

public class ReferenceSample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.cry();

        // dog.name(); 사용 X
        ((Dog)dog).name(); // 사용 O
    }
}

- interface 상속
자바는 다중 상속이 불가능하지만 인터페이스는 다중 구현이 가능하다. 인터페이스는 인터페이스 부터만 상속을 받을 수 있고 상속과 구현을 동시에 할 수 있다.   

ex : class 클래스명 extends 상위클래스명 implements 인터페이스명 {...}

- interface Default Method (Java 8)
  Default Method를 통해 인터페이스도 구현부가 있는 메서드를 가질 수 있다. 인터페이스에 선언되며, 구현부를 포함한 메서드이다.
default 키워드를 사용하여 정의한다.

목적 
1. 기존 코드와의 호환성 유지: 기존 인터페이스에 새로운 메서드를 추가하더라도, 인터페이스를 구현한 기존 클래스들이 영향을 받지 않도록 하기 위해서이다.
2. 코드 중복 제거: 공통 로직을 인터페이스에서 구현하여 여러 클래스에서 재사용 가능하다.

기존 인터페이스를 확장하고, 다중 상속 문제를 해결하기 위해서 사용한다. static method와의 차이는 default는 인스턴스 메서드처럼 동작하며, 구현 클래스의 객체를 통해 호출되지만 static은 인터페이스 이름을 통해 직접 호출된다.

다만 Object 클래스의 메서드 (equals(), hashCode(), toString())는 Default Method로 정의할 수 없다.

ex
public interface 인터페이스이름 {
    void 추상메서드();

    default void default메서드() {""}
}
   
- interface static method (Java 8)
  인터페이스에서 선언된 정적 메서드로, 객체 생성 없이 인터페이스 이름을 통해 호출된다. static 키워드를 사용하여 정의한다. 구현 클래스가 아닌 인터페이스 자체와 연결된다.

  목적  
1. 유틸리티 메서드 제공: 인터페이스와 관련된 기능(유효성 검사, 변환 등)을 제공한다
2. 객체 의존성 제거: 객체를 생성하지 않아도 메서드를 호출 가능하다.
3. 클래스 간의 충돌 방지: 인터페이스마다 독립적으로 정적 메서드를 관리한다.

ex
public interface 인터페이스명 {
    static void static메서드() {""}
}

- interface private method (Java 9)
인터페이스 내부에서만 사용되는 메서드로, 다른 Default Method 또는 Static Method에서 호출하여 로직을 공유할 수 있다.

특징   
1. private 또는 private static으로 정의한다. 일반적인 Private Method는 인스턴스 컨텍스트에서 사용하고 static Private Method는 정적 컨텍스트에서 사용한다.
2. 인터페이스 외부에서는 호출 불가능하다. 구현 클래스나 다른 코드에서 접근할 수 없다.
3. Default Method 및 Static Method에서 호출 가능하다.
4. 코드 중복을 제거하고 캡슐화를 위해 사용할 수 있다.
   
ex
일반 private method   
private 메서드이름(매개변수) {}   
static private method   
private static 메서드이름(매개변수) {}


- 참고 문헌 및 출처
  [[JAVA]Interface 인터페이스 모든것!](https://castleone.tistory.com/11)
  [Java 인터페이스(interface)](https://haemanlee.tistory.com/19)