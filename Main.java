// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Shape s=new Shape();

Circle c= new Circle(5.0);

Rectangle r=new Rectangle(4.0,5.0,"blue",false);

Square sq =new Square(4.0);

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getperimeter());

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getperimeter());

        System.out.println("Square Area: " + sq.getArea());
        System.out.println("Square Perimeter: " + sq.getperimeter());

    }
}