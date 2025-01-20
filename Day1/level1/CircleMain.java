import java.util.Scanner;
class Circle {
    private
    double radius;

    public

    Circle(double radius){
        this.radius = radius;
        calculateArea(radius);
        calculateCircum(radius);
    }

    void calculateArea(double radius){
        double area = 3.14*radius*radius;
        System.out.println("Area of the circle is "+area);
    }

    void calculateCircum(double radius){
        double circumference = 2*3.14*radius;
        System.out.println("Circumference is "+circumference);
    }
}

public class CircleMain{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        Circle c1 = new Circle(radius);
    }
}


