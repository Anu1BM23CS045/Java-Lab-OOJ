package SEE;
import CIE.*;
import java.util.Scanner;

public class Externals extends Internals{
protected int marks[];
protected int finalMarks[];
Scanner sc=new Scanner(System.in);

public Externals(){
marks=new int[5];
finalMarks=new int[5];
}

public void inputSEEmarks(){

System.out.println("Enter SEE marks(out of 50):");
for(int i=0;i<5;i++)
{
System.out.println("Enter sub"+(i+1)+"marks:");
marks[i]=sc.nextInt();
}
}

public void calcFinalMarks()
{
for(int i=0;i<5;i++)
{
finalMarks[i]=super.marks[i]+marks[i];
}
}

public void displayFinalMarks()
{
System.out.println("Final Marks:");
for(int i=0;i<5;i++)
{
System.out.print("Sub"+(i+1)+":"+finalMarks[i]+"  ");
}

System.out.println();
}

public void displayStudentDetails()
{
System.out.println("Student details:\nUsn:"+usn+"\nName:"+name+"\nPresent Sem:"+sem);
displayFinalMarks();
}
}