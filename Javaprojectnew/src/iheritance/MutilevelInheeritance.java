package iheritance;
  class Base{
	  int a=10;
	 
 }
  class Base2 extends Base {
	  int b=20;
	  
  }
class Base3 extends Base2{
	int c=30;
}


public class MutilevelInheeritance extends Base3 {
int d=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutilevelInheeritance obj=new MutilevelInheeritance();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		//creating of the object class method and multilevelinheritance..
		Base3 obj1=new Base3();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		System.out.println(obj1.c);
		
		Base2 obj2=new Base2();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		Base obj3=new Base();
		
		
		System.out.println(obj3.a);
		
		
		
		
			
		
	

	}

}
