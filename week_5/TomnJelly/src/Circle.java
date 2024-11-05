public class Circle {
    public int radius;

    public Circle(int radius) {
        if (radius > 0 && radius < 2000) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be between 0 and 2000.");
        }
    }

    public int get_radius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0 && radius < 2000) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be between 0 and 2000.");
        }
    }

    public float area() {
        return (float) (Math.PI * radius * radius);
    }

    public float perimeter() {
        return (float) (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("Radius: " + circle.get_radius());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        circle.setRadius(10);
        System.out.println("Radius: " + circle.get_radius());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}
