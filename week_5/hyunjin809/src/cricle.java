import java.util.Scanner;

public class Circle {
    private int radius;
    private final static double PI = 3.14;

    public Circle(int radius){
        set_radius(radius);
    }
    public int get_radius(){
        return radius;
    }
    public void set_radius(int radius){
        if(radius <= 0 || radius > 2000){
            throw new IllegalArgumentException("radius의 범위는 (0, 2000)이다.");
        }
        this.radius = radius; 
    }
    public float perimeter(){
        return (float) (2 * PI * radius);
    }
    public float area(){
        return (float)  (PI * radius * radius);
    }
    public void printCircle(){
        System.out.println("반지름: "+radius+"\n둘레"+perimeter()+"넓이"+area());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRadius = scanner.nextInt();
        Circle circle = new Circle(inputRadius);
        circle.printCircle();
        scanner.close();
    }
}
