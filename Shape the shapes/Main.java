import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String name = in.nextLine();
		if(name.equalsIgnoreCase("Sphere")) {
			int rad = in.nextInt();
			if(rad>0) {
			Circle c = new Circle(name, rad);
			System.out.printf("The volume of the sphere is %.2f" ,c.calculateArea());	}
			else
				System.out.println("Invalid Input");
		}
		else if(name.equalsIgnoreCase("Cube")) {
			int side = in.nextInt();
			if(side>0) {
			Square s = new Square(name, side);
			System.out.printf("The volume of the cube is %.2f" ,s.calculateArea());}
			else
				System.out.println("Invalid Input");
		}
		else if(name.equalsIgnoreCase("Cuboid")) {
			int len = in.nextInt();
			int bre = in.nextInt();
			int hei = in.nextInt();
			if(len>0&&bre>0&&hei>0) {
			Rectangle r = new Rectangle(name, len, bre, hei);
			System.out.printf("The volume of the cuboid is %.2f" ,r.calculateArea()); }
			else
				System.out.println("Invalid Input");
		}
	}
}

abstract class Shape {
	protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public float calculateArea() {
		return 1.1f;
	}
}

class Rectangle extends Shape {
	private int length;
	private int breadth;
	private int height;
	public Rectangle(String name, int length, int breadth, int hei) {
		super(name);
		this.length = length;
		this.breadth = breadth;
		this.height = hei;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int hei) {
		this.height = hei;
	}
	public float calculateArea() {
		float area = this.getLength()*this.getBreadth()*this.getHeight();
		return area;
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float calculateArea() {
		float pi = 3.14f;
		float area = (pi*this.getRadius()*this.getRadius()*this.getRadius()*4)/3 ;
		return area;
	}
}

class Square extends Shape {
	private int side;

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	public float calculateArea() {
		float area = this.getSide()*this.getSide()*this.getSide();
		return area;
	}
}