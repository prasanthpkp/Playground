import java.util.Scanner;

public class Main {
	public static void main(String args[]){  
  		int i,fact=1;  
      	Scanner sc = new Scanner (System.in);
  		int number=sc.nextInt();
        if(number>0) {
  		for(i=1;i<=number;i++){    
      		fact=fact*i;    
  		}    
  		System.out.println(fact);    
        }
      else if (number == 0)
        System.out.println("1");
      else
        System.out.println("Invalid Input");
 	}  
}