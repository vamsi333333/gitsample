package interfaces;


interface i1
{
	void fun1();

	void fun3();
}
interface i2 extends i1
{
	void fun2();
}

public class InterfaceSyntax2 implements i1,i2 {
	@Override
	public void fun2() {
		System.out.println("demo2 function..");
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("demo1 function method...");
	}
	public void fun3() {
		System.out.println("function method ..");
	}
	

	public static void main(String[] args) {
		
		 InterfaceSyntax2 obj1=new  InterfaceSyntax2();
	obj1.fun1();
	obj1.fun2();
	obj1.fun3();
	i1 obj2=new  InterfaceSyntax2();
	obj2.fun1();
	
	obj2.fun3();
	i2 obj3=new InterfaceSyntax2();
	obj3.fun3();
	obj3.fun2();
	

	
		
	}

}
