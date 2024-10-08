import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("You can exit the program by entering 0");
        while (true) {
            System.out.println("Enter the number: ");
            n = scanner.nextInt();

            if (n == 0) {
                System.out.println("Program exited succcessfully");
                break;
            } else {
                for (int i = 0; i < 9; i++) {
                    System.out.println(n + " x " + i + 1 + " = " + n * (i + 1));
                }
            }
        }
        scanner.close();

    }
}
