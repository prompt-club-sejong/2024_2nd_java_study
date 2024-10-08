import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 1; j < 10; j++){
            System.out.println(i + " * " + j + " = " + i*j);
        }
    }
}
