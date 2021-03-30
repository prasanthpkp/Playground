import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String con = sc.nextLine();
    int id = sc.nextInt();
    switch(id) {
    case 1: {
    	sc.nextLine();
    	String name = sc.nextLine();
    	Long age = sc.nextLong();
    	sc.nextLine();
    	String vname = sc.nextLine();
    	Long won = sc.nextLong();
    	Racer br = new BikeRacer (con,name,age,vname,won);
    	br.displayDetails();
    	break;
    }
    case 2: {
    	sc.nextLine();
    	String name = sc.nextLine();
    	Long age = sc.nextLong();
    	sc.nextLine();
    	String vname = sc.nextLine();
    	Long won = sc.nextLong();
    	Racer cr = new CarRacer (con,name,age,vname,won);
    	cr.displayDetails();
    	break;
    }
    default:{
    	System.out.println("Invalid Input");
    	System.exit(0); }
    }
  }
}

class Racer{
	private String con;

	public Racer(String con) {
		super();
		this.con = con;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}
	
	public void displayDetails() {
		
	}
}

class BikeRacer extends Racer{
	private String name;
	private Long age;
	private String vname;
	private Long won;
	public BikeRacer(String con, String name, Long age, String vname, Long won) {
		super(con);
		this.name = name;
		this.age = age;
		this.vname = vname;
		this.won = won;
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
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Long getWon() {
		return won;
	}
	public void setWon(Long won) {
		this.won = won;
	}
	public void displayDetails() {
		System.out.println("Country: "+this.getCon());
		System.out.println("Racer Name: "+this.getName());
		System.out.println("Age of the racer: "+this.getAge());
		System.out.println("Vehical Name: "+this.getVname());
		System.out.println("Number of awards: "+this.getWon());
	}
}

class CarRacer extends Racer{
	private String name;
	private Long age;
	private String vname;
	private Long won;
	public CarRacer(String con, String name, Long age, String vname, Long won) {
		super(con);
		this.name = name;
		this.age = age;
		this.vname = vname;
		this.won = won;
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
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Long getWon() {
		return won;
	}
	public void setWon(Long won) {
		this.won = won;
	}
	public void displayDetails() {
		System.out.println("Country: "+this.getCon());
		System.out.println("Racer Name: "+this.getName());
		System.out.println("Age of the racer: "+this.getAge());
		System.out.println("Vehical Name: "+this.getVname());
		System.out.println("Number of awards: "+this.getWon());
	}
}