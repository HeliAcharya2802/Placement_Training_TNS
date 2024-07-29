package Interfacee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle(5.0, 3.0);
        Shape circle = new Circle(4.0);
        Shape triangle = new Triangle(6.0, 2.5);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
	}

}
