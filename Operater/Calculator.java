import java.util.Scanner;

class Demo{
    public int add(int n1,int n2)
    {
   
     int  result =n1+n2;
        System.out.println(" result  " +result);
        return result;
        
    }
}
public class Calculator{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter n1  ");
        int n1=sc.nextInt();
        
            System.err.println("Enter n2  ");
        int n2=sc.nextInt();
      Demo Dem=new Demo();
     int result =Dem.add(n1,n2);

       // int result=n1+n2;
       // System.out.println(result);
    }
}