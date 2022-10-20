package demo;
import  java.util.*;
class Emp
{
int eid;
String ename;
double  esal;
Emp(int eid,String ename,double  esal)
{
this.eid=eid;
this.ename=ename;
this.esal=esal;
}
}
class  Student
{
int sid;
String sname;
String course;
Student(int  sid,String sname,String course)
{
this.sid=sid;
this.sname=sname;
this.course=course;
}
}

class Product 
{
int pid;
String pname;
double  price;
Product(int pid,String pname,double  price)
{
this.pid=pid;
this.pname=pname;
this.price=price;
}
}





public class ArraListDemo {

	public static void main(String[] args) {
		ArrayList<Object> arl=new ArrayList();
	    arl.add(new Emp(101,"kavitha",19000));
	    arl.add(new Student(102,"ravi","btech"));
	    arl.add(new Product(103,"lux",45));
	    
	    
	    arl.forEach(x->{
	   if(x instanceof Emp)
	   {
	     Emp e1=(Emp)x;
	     System.out.println("Eid:::"+e1.eid+"::ename::"+e1.ename+":::"+e1.esal);
	   }
	    	
	   if(x instanceof Student)
	   {
	     Student s1=(Student)x;
	     System.out.println("Sid:::"+s1.sid+"::Sname::"+s1.sname+":::"+s1.course);
	   }
	    	
	   if(x instanceof Product)
	   {
	     Product p=(Product)x;
	     System.out.println("Pid:::"+p.pid+"::Pname::"+p.pname+":::"+p.price);
	   }
	    	
	   
	   
	    	
	    	
	    });
	    
		
		
	
		
		
		
	}

}
