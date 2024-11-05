class Parent {
    void display() { 
      System.out.println("부모 클래스의 display() 메소드입니다."); 
    }
}

class Child extends Parent {
    void display() { 
      System.out.println("자식 클래스의 display() 메소드입니다."); 
    }
}


public class Inheritance{
  public static void main(String[] args) {
    Parent pa = new Parent();
    pa.display();

    Child ch = new Child();
    ch.display();

    Parent pc = new Child();
    pc.display();
  }
      
}
// 부모 클래스인 Parent 클래스의 display() 메소드를 자식 클래스인 Child 클래스에서 오버라이딩 한 것 

// 실행결과
// 부모 클래스의 display() 메소드입니다.

// 자식 클래스의 display() 메소드입니다.

// 자식 클래스의 display() 메소드입니다.