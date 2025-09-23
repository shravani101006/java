import java.lang.Math;
import java.util.Scanner;
class Quadratic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,D;
        System.out.println("Enter the coefficients a,b,c of the quadratic equation");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        D=b*b-4*a*c;
        if(a==0)
        {
            System.out.println("Not a quadratic equation");
            return;
        }
        else
        {
            if(D>0)
            {   
                double x1=(-b+Math.sqrt(D))/(2*a);
                double x2=(-b-Math.sqrt(D))/(2*a);
                System.out.println("Roots are real and different");
                System.out.println("x1="+x1+" x2="+x2);
            }
            else if(D==0)
            {
                double x=-b/(2*a);
                System.out.println("Roots are real and same");
                System.out.println("x="+x);
            }
            else
            {
                System.out.println("No real roots");
            }
        }
    }
}