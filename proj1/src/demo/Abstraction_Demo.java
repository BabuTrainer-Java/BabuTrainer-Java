package demo;
import  java.util.*;
public class Abstraction_Demo {
int eid;
String ename;
double  esal;
public void chkauth(String uname,String pwd)
{
if(uname.equals("admin")  &&  pwd.equals("admin@123"))
{
	eid=101;
	ename="suma";
	esal=21000;
	System.out.println("Eid:::"+eid);
	System.out.println("Ename:::"+ename);
	System.out.println("Esal::"+esal);
}
else
{
System.out.println("your authtication is  in valid  please Relogin ");	
}
	
	
}
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
while(true)
{	
System.out.println("1.Authication");
System.out.println("2.exit");
System.out.println("Enter your choice");
int i=sc.nextInt();

switch (i) 
{
case 1:
	System.out.println("Enter userName");
	String inputuser=sc.next();
	System.out.println("Enter Password");
	String inputpass=sc.next();
	new Abstraction_Demo().chkauth(inputuser, inputpass);
	break;
case 2:System.exit(1);
break;
default:
	break;
}

}
	
	
	
}

}
