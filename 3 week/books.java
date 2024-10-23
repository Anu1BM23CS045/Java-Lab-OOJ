import java.util.Scanner;
class Books{
 String name,author;
 int price,numPages;

Books(String name,String author,int price,int numPages)
{
this.name=name;
this.author=author;
this.price=price;
this.numPages=numPages;
}
public String toString()
{
String name,author,price,numPages;
name="Book name:"+this.name+"\n";
author="Author name:"+this.author+"\n";
price="Price:"+this.price+"\n";
numPages="Number of pages:"+this.numPages+"\n";
return name+author+price+numPages;
}
}

class Bookrun{
public static void main(String arg[])
{
System.out.println("Anu Sai Shree R\n1BM23CS045");
Scanner s=new Scanner(System.in);
int n,price,numPages;
String name,author;
System.out.println("Enter number of books:");
n=s.nextInt();
Books b[];
b=new Books[n];

for(int i=0;i<n;i++)
{
System.out.println("enter name,author,price and number of pages of Book"+(i+1)+":");
name=s.next();
author=s.next();
price=s.nextInt();
numPages=s.nextInt();
b[i]=new Books(name,author,price,numPages);
}
System.out.println("\nBooks Details:");
for(int i=0;i<n;i++)
{
System.out.println("Book"+(i+1)+":\n"+b[i]);
}
}
}




