import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=(a/100)+(a%10);
      System.out.println(b);
	}
}