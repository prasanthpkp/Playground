import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		float weight=sc.nextFloat();
		int age=sc.nextInt();
		String color=sc.next();
		String breed =sc.next();
		if(weight>0 && age>0)
		{
		Dog d= new Dog();
		d.detail(name,weight,age,color,breed);
		}
		else {
	        System.out.print("Invalid Input");

		}

	}

}
class Dog {

	public void detail(String name, float weight, int age, String color, String breed) {
		if(name.matches("^[a-zA-Z\\s]*$"))
		   { 
		System.out.println("Name of the dog: "+name);
		System.out.println("Weight of the dog: "+weight);
		System.out.println("Age of the dog: "+age);
		System.out.println("Color of the dog: "+color);
		System.out.println("Breed of the dog: "+breed);
		   }
		else {
	        System.out.print("Invalid Input");

		}
		
	}

}
