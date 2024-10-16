import java.util.Scanner;
class Student{
 int marks[]=new int[8];
 int credits[]=new int[8];
 String usn,name;
 double sgpa;
 int escore=0,total_c=0; 



 void accept_det()
 {
  Scanner s=new Scanner(System.in);
 System.out.print("Enter usn and name:");
 usn=s.next();
 name=s.next();
 System.out.println("Enter Subject marks with it's respective credits:");
 for(int i=0;i<8;i++)
 {
 System.out.print("Sub"+(i+1)+":");
 marks[i]=s.nextInt();
 credits[i]=s.nextInt();
 }
}

double calc_sgpa()
{
int grade;
for(int i=0;i<8;i++)
{
grade=(marks[i]/10)+1;
if(grade==11)
 grade=10;
else if(grade<4)
 return -1.0;
escore+=(grade*credits[i]);
total_c+=credits[i];
}
sgpa=(double)escore/total_c;
return sgpa;
}

void display()
{
System.out.println("Details:\nName:"+name+"\nUsn:"+usn+"\nMarks of subjects:");
for(int i=0;i<8;i++)
{
System.out.print("Sub"+(i+1)+": "+marks[i]+" ");
}

System.out.println("\nSgpa:"+sgpa);
}
}

class StudSgpa{
public static void main(String args[])
{
System.out.println("Anu Sai Shree R\n1BM23CS045");
Student stud[]=new Student[3];
for(int i=0;i<3;i++)
{
 stud[i]=new Student();
 stud[i].accept_det();
}
for(int i=0;i<3;i++)
{

if(stud[i].calc_sgpa()==-1.0)
 System.out.println(stud[i].name+"with usn:"+stud[i].usn+":Sgpa cannot be calculated:Any one sub is Failed");
else
 stud[i].display();
}
}
}






 


