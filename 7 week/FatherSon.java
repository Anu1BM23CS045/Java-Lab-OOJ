import java.util.Scanner;
class WrongAge extends Exception{
int a;
WrongAge(int a)
{
this.a=a;
}
public String toString(){
return a+" is a invalid Age";
}
}

class SonAgeExceedsFatherAge extends Exception{
int fa,a;
SonAgeExceedsFatherAge(int fa,int a)
{
this.fa=fa;
this.a=a;
}

public String toString(){
return "father's("+fa+") age cannot be lesser than that of son("+a+")";
}
}

class Father {
int fage;
Father(int a) {
fage=a;
}
public void fathervalidage() throws WrongAge{
if(fage<0){
throw new WrongAge(fage);}
}
}

class Son extends Father{
int age;
Son(int fa,int a) 
{
super(fa);
age=a;}
public void sonvalidage() throws SonAgeExceedsFatherAge{
if(fage<age){
throw new SonAgeExceedsFatherAge(fage,age);
}
}
void display()
{
System.out.println("Father's age:"+fage+"\nSon's age:"+age);
}
}

class FatherSon{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Anu Sai Shree R\n1BM23CS045");
System.out.println("Enter Father's age:");
int fage=sc.nextInt();
System.out.println("Enter Son's age:");
int age=sc.nextInt();
Son child=new Son(fage,age);
try{
child.fathervalidage();
child.sonvalidage();
System.out.println("Ages are valid");
child.display();
}
catch(WrongAge e){
System.out.println(e);
}
catch(SonAgeExceedsFatherAge e){
System.out.println(e);
}
}    
}

