import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList<String> a=new LinkedList<String>();
int n,i;
n=sc.nextInt();
for(i=0;i<=n;i++)
{
String str=sc.nextLine();
a.add(str);
}
LinkedList<String> a1=(LinkedList<String>)a.clone();

System.out.print("Actual LinkedList:");
Iterator<String> it=a.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
System.out.print("Cloned LinkedList:");
Iterator<String> it1=a1.iterator();
while(it1.hasNext())
{
System.out.println(it1.next());
}
}
}