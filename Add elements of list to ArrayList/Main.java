import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        String n = obj.nextLine();
        StringTokenizer st = new StringTokenizer(n," ");
        while(st.hasMoreTokens())
        {
            list.add(st.nextToken());
        }
        System.out.println("List:"+ list);
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(list);
        System.out.println("ArrayList:"+ a);
    }
}