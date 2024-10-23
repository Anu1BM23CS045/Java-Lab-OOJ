import java.util.Scanner;

abstract class Shape{
int dim1,dim2;
double area;
Scanner s=new Scanner(System.in);
abstract void printarea();
}

class Rectangle extends Shape{
Rectangle()
{
System.out.println("Enter dimensions of rectangle:");
dim1=s.nextInt();
dim2=s.nextInt();

}
void printarea()
{
area=dim1*dim2;
System.out.println("Area of Rectangle:"+area);
}
}

class Triangle extends Shape{
Triangle()
{
System.out.println("Enter dimensions of triangle:");
dim1=s.nextInt();
dim2=s.nextInt();

}
void printarea()
{
area=(dim1*dim2)/2.0;
System.out.println("Area of Triangle:"+area);
}
}

class Circle extends Shape{
Circle()
{
System.out.println("Enter dimensions of circle:");
dim1=s.nextInt();

}
void printarea()
{
area=3.14*dim1*dim1;
System.out.println("Area of Circle:"+area);
}
}

class Shaperun{
public static void main(String args[])
{
System.out.println("Anu Sai Shree R\n1BM23CS045");
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
r.printarea();
t.printarea();
c.printarea();
}
}
