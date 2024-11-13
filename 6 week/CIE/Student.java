package CIE;
import java.util.Scanner;
public class Student{
protected String usn=new String();
protected String name=new String();
protected int sem;
public void inputStudentDetails()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter usn,name and present semester :");
usn=sc.next();
name=sc.next();
sem=sc.nextInt();
}
public void displayStudentDetails()
{
System.out.println("Student details:\nUsn:"+usn+"\nName:"+name+"\nPresent Sem:"+sem);
}
}