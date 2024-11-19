import java.util.Scanner;

public class week2 {
  public static void main(String[] args) {

    System.out.print("Enter your name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Hello, " + name + "!");
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("You are " + age + " years old.");
    sc.close();

  }

}
