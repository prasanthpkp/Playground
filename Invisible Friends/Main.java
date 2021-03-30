
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
			String gender =sc.nextLine(); 
			int age =sc.nextInt();
          if(age>0 && (gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female"))){
            
			Friend fd=new Friend();
			fd.detail(name, gender,age);
            }
              else
              {
      System.out.print("Invalid Input");
  }
	}

}
class Friend {

	public void detail(String name, String gender, int age) {
		if(name.matches("^[a-zA-Z\\s]*$"))
		   {
		   	System.out.println("Friends Details");
		   	System.out.println("Name: "+name);
		   	System.out.println("Gender: "+gender);
		   	System.out.print("Age: "+age);
	       }
	     else {
			   System.out.println("Invalid Input");

		   }
		
	}

}

