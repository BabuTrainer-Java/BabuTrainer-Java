package demo;
abstract class Ab1
{
abstract  void  m1();
abstract  void  m2();
abstract  void  m3();
static void  m4()
{
System.out.println(" this the m4 ");	
}
public void  m5()
{
	System.out.println(" this the  m5 ");	
}	
}

abstract class  Ab2 extends Ab1
{
public void  m1()
{
System.out.println(" m1 ");	
}
public void m2()
{
System.out.println(" m2 ");	
}
	
}

public class AbsDemo  extends Ab2{
	@Override
	public void m3() {
		System.out.println(" m3 ");
		
	}


	public static void main(String[] args) {
		
		Ab2 ref=new AbsDemo();
		
	   ref.m1();
	   ref.m2();
	   ref.m3();
	   Ab1.m4();
	   ref.m5();
		
		
		
		
		
	}

	
}
