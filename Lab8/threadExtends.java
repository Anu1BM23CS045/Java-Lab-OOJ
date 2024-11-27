class BMS extends Thread
{
public void run()
{
for(int i=1; i<=5; i++)
{
System.out.println("BMS College of Engineering");
try{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("interrupted.");
}
}
}
}

class CS extends Thread
{
public void run()
{
for(int i=1; i<=5; i++)
{
System.out.println("CSE");
try{
Thread.sleep(2000);
}
catch(InterruptedException e)
{
System.out.println("interrupted.");
}
}
}
}

class threadExtends{
public static void main(String args[]){
System.out.println("Anu Sai Shree R\n1BM23CS045");
BMS b=new BMS();
CS c=new CS();
b.start();
c.start();

}
}
