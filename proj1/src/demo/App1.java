package demo;

class SApp
{
	int age=10;
	String name="kamal";
	double sal=19000;
}


public class App1  extends SApp{

	public  static void main(String args[])
	{
     App1  obj1=new App1();

     System.out.println("Age:::"+obj1.age);
     System.out.println("Name:::"+obj1.name);
     System.out.println("Sal:::"+obj1.sal);
    	
	}
}
