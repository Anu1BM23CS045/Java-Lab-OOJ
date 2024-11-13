import SEE.*;
import CIE.*;
import java.util.Scanner;

class Main{
public static void main(String args[])
{
System.out.println("1BM23CS045\nAnu Sai Shree R");
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter number of Students:");
n=sc.nextInt();
Externals stud[]=new Externals[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter Student"+(i+1)+" details:");
stud[i]=new Externals();
stud[i].inputStudentDetails();
stud[i].inputCIEmarks();
stud[i].inputSEEmarks();
stud[i].calcFinalMarks();
stud[i].displayStudentDetails();

}
}
}
