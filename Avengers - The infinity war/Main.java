import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int id = sc.nextInt();
    if(id == 1) {
    sc.nextLine();
    String name = sc.nextLine();
    int age = sc.nextInt();
    sc.nextLine();
    String color = sc.nextLine();
    double like = sc.nextDouble();
    sc.nextLine();
    String strength = sc.nextLine();
    String weak = sc.nextLine();
    Avenger ha = new HeroAvenger(name,age,color,like,strength,weak);
    ha.displayDetails();
    }
    else if(id == 2) {
    	sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String color = sc.nextLine();
        double like = sc.nextDouble();
        sc.nextLine();
        String strength = sc.nextLine();
        String weak = sc.nextLine();
        String killedBy = sc.nextLine();
        Avenger va = new VillainAvenger(name,age,color,like,strength,weak,killedBy);
        va.displayDetails();
    }
    else
      System.out.println("Invalid Input");
  }
}
class Avenger{
	private String name;
	private int age;
	private String color;
	private double like;
	public Avenger(String name, int age, String color, double like) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.like = like;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLike() {
		return like;
	}
	public void setLike(double like) {
		this.like = like;
	}
	public void displayDetails() {
		
	}
}
class HeroAvenger extends Avenger{
	private String strength;
	private String weak;
	public HeroAvenger(String name, int age, String color, double like, String strength, String weak) {
		super(name, age, color, like);
		this.strength = strength;
		this.weak = weak;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getWeak() {
		return weak;
	}
	public void setWeak(String weak) {
		this.weak = weak;
	}
	public void displayDetails() {
		System.out.println("Avenger Details");
		System.out.println("Name: "+this.getName());
		System.out.println("Age: "+this.getAge());
		System.out.println("Color: "+this.getColor());
		System.out.println("Strength: "+this.getStrength());
		System.out.println("What Kills: "+this.getWeak());
		if(this.getLike()>80)
			System.out.println("Liked: Yes");
		else
			System.out.println("Liked: No");
	}
}
class VillainAvenger extends Avenger{
	private String strength;
	private String weak;
	private String killedBy;
	public VillainAvenger(String name, int age, String color, double like, String strength, String weak, String killedBy2) {
		super(name, age, color, like);
		this.strength = strength;
		this.weak = weak;
	}
	public String getKilledBy() {
		return killedBy;
	}
	public void setKilledBy(String killedBy) {
		this.killedBy = killedBy;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getWeak() {
		return weak;
	}
	public void setWeak(String weak) {
		this.weak = weak;
	}
	public void displayDetails() {
		System.out.println("Avenger Details");
		System.out.println("Name: "+this.getName());
		System.out.println("Age: "+this.getAge());
		System.out.println("Color: "+this.getColor());
		System.out.println("Strength: "+this.getStrength());
		System.out.println("What Kills: "+this.getWeak());
		System.out.println("Defeated By: "+this.getKilledBy());
		if(this.getLike()>80)
			System.out.println("Liked: Yes");
		else
			System.out.println("Liked: No");
	}
}