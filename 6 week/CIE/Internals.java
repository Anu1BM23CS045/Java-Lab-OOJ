package CIE;
import java.util.Scanner;
public class Internals extends Student{
protected int marks[]=new int[5];
public void inputCIEmarks()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter CIE marks:");
for(int i=0;i<5;i++)
{
System.out.println("Enter sub"+(i+1)+"marks:");
marks[i]=sc.nextInt();
}

}
}
