import java.util.Scanner;
import java.lang.Math;
class Quadratic{
 int a,b,c;
double r1,r2,d;
Scanner s=new Scanner(System.in);
void getdata()
{
 System.out.println("Enter a,b,c values:");
 a=s.nextInt();
 b=s.nextInt();
 c=s.nextInt();
}
void compute()
{
while(a==0)
{
System.out.println("The equation is not quadratic,re-enter the a value:");
a=s.nextInt();
}
d=b*b-4*a*c;
if(d>0)
{
r1=(-b+Math.sqrt(d))/(double)(2*a);
r2=(-b-Math.sqrt(d))/(double)(2*a);
System.out.println("Real and distant roots:\nRoot1:"+r1+"\nRoot2:"+r2);
}
else if(d==0)
{
r1=-b/(double)(2*a);
System.out.println("Real and equal roots:\nRoot1:"+r1+"\nRoot2:"+r1);
}
else
{
r1=-b/(2*a);
r2=Math.sqrt(-d)/(2*a);
System.out.println("Roots are imaginary:\nRoot1:"+r1+"+i"+r2+"\nRoot2:"+r1+"-i"+r2);
} 
}
}

class Quadrun{
public static void main(String args[])
{
Quadratic q=new Quadratic();
q.getdata();
q.compute();
}
}






         






























































































