import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int id = sc.nextInt();
    sc.nextLine();
    String name = sc.nextLine();
    int units = sc.nextInt();
    double cost = sc.nextDouble();
    int id1 = sc.nextInt();
    sc.nextLine();
    String name1 = sc.nextLine();
    int units1 = sc.nextInt();
    double cost1 = sc.nextDouble();
    for(int i=0;i<name.length();i++){
      if((name.charAt(i)>=65 && name.charAt(i)<=90)||(name.charAt(i)>=97 && name.charAt(i)<=122)||(name.charAt(i)==' '))
        continue;
      else{
        System.out.print("Invalid Input");
      	System.exit(0);}
    }
    for(int i=0;i<name1.length();i++){
      if((name1.charAt(i)>=65 && name1.charAt(i)<=90)||(name1.charAt(i)>=97 && name1.charAt(i)<=122)||(name1.charAt(i)==' '))
        continue;
      else{
        System.out.print("Invalid Input");
      	System.exit(0);}
    }
    Bill cb = new CurrentBill(id, name, units, cost);
    cb.displayDetails();
    Bill pb = new PhoneBill(id1, name1, units1, cost1);
    pb.displayDetails();
    
  }
}

class Bill{
	private int id;
	private String name;
	public Bill(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void displayDetails() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class CurrentBill extends Bill{
	private int units;
	private double cost;
	public CurrentBill(int id, String name, int units, double cost) {
		super(id, name);
		this.units = units;
		this.cost = cost;
	}
	public void displayDetails() {
		System.out.println("Bill Number: "+this.getId());
		System.out.println("Customer Name:"+this.getName());
		System.out.println("Electricity Bill Amount: "+(this.getUnits()*this.getCost()));
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}

class PhoneBill extends Bill{
	private int units;
	private double cost;
	public PhoneBill(int id, String name, int units, double cost) {
		super(id, name);
		this.units = units;
		this.cost = cost;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void displayDetails() {
		System.out.println("Bill Number: "+this.getId());
		System.out.println("Customer Name:"+this.getName());
		System.out.println("Phone Bill Amount: "+(this.getUnits()*this.getCost()));
	}
}