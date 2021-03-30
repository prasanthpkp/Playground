import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int first=a%10;
    int second=((a/10)%10);
    int third=a/100;
    int sum=(first*100)+(second*10)+third;
    System.out.println(sum);//Type your code here
  }
}