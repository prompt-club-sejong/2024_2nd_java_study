abstract class Animal { abstract void cry(); }

class Cat extends Animal { void cry() { System.out.println("냐옹냐옹!"); } }

class Dog extends Animal { void cry() { System.out.println("멍멍!"); } }

public class Polymorphism {
  public static void main(String[] args) {
    // Animal a = new Animal(); // 추상 클래스는 인스턴스를 생성할 수 없음.
    Cat c = new Cat();
    Dog d = new Dog();

    c.cry();
    d.cry();
    

    }

}
// 위의 예제에서 추상 클래스인 Animal 클래스는 추상 메소드인 cry() 메소드를 가지고 있습니다.
// Animal 클래스를 상속받는 자식 클래스인 Dog 클래스와 Cat 클래스는 cry() 메소드를 오버라이딩해야만 비로소 인스턴스를 생성할 수 있습니다.