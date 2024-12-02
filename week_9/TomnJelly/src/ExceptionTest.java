import java.util.Scanner;

public class ExceptionTest {

  public static int divide(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("두 자연수를 입력해주세요");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();

    try {
      System.out.println("계산한 값: " + divide(a, b));
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
    }

  }

}