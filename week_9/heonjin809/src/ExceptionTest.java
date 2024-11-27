import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num1 / num2;

        System.out.println("Result: " + result);

        scanner.close();
    }
}
