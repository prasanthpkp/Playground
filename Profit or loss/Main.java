import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        if(a>(b*12))
        System.out.printf("Loss : Rs.%.2f",(a-b*12));
        else if(a<(b*12))
        System.out.printf("Profit : Rs.%.2f",(b*12-a));
        else
        System.out.println("No profit nor loss");
    }
}