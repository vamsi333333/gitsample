package interfaces;
  interface i1{
	  void method1();
  }
  interface i2{
	  void method2();
  }
  interface i3{
	  void method3();
  }
  class Test1{
	  void method4() {
		  System.out.println("method4 is a test1 class");
	  }
  }
public class MultipleInterface extends Test1 implements i1,i2,i3{
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3 is a passed");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 is a passed");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method is a passed..");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface obj1=new MultipleInterface();
		obj1.method1();
		
		obj1.method2();
		
		obj1.method3();
		obj1.method4();
		Test1 obj2=new MultipleInterface();
obj2.method4();
		
		
		
			
		
		

	}


	

}
