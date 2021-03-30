import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String name = sc.nextLine();
    Long mil = sc.nextLong();
    sc.nextLine();
    String color = sc.nextLine();
    String bcom = sc.nextLine();
    String num = sc.nextLine();
    Racer bike = new BikeRacer(name,mil,color,bcom,num);
    bike.displayDetails();
  }
}

class Racer{
	private String name;
	private Long age;
	public Racer(String name, Long age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	
}

class BikeRacer extends Racer{
	private String vname;
	private String color;
	private String num;
	public BikeRacer(String con, Long mil, String color, String vname, String num) {
		super(con,mil);
		this.vname = vname;
		this.color = color;
		this.num = num;
	}
	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void displayDetails() {
		System.out.println("Bike Details:");
		System.out.println("Bike model: "+this.getName());
		System.out.println("Mileage: "+this.getAge()+" km/l");
		System.out.println("Company name: "+this.getColor());
		System.out.println("Bike color: "+this.getVname());
		System.out.println("Bike Number: "+this.getNum());
	}
}