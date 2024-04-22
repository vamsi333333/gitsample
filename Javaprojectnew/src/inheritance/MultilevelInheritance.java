package inheritance;
class Base
{
	int a=10;
}
class BaseI1 extends Base
{
	int b=20;
	
}
class BaseI2 extends BaseI1{
	int c=30;
}
public class MultilevelInheritance extends BaseI2 
{
	int d=40;

	public static void main(String[] args) 
	{
		
    MultilevelInheritance obj1=new MultilevelInheritance();
    System.out.println(obj1.a);
    System.out.println(obj1.b);
    System.out.println(obj1.c);
    System.out.println(obj1.d);
    

	}

}
