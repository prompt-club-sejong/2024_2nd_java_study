import java.util.Scanner;

public class week_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello, " + name);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old");
    }
}

//Enter your name: {M1nu0x0}
//Hello, M1nu0x0!
//Enter your age: {22}
//You are 22 years old.