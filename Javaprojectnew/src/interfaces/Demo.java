package interfaces;


interface I
{
   int a=10;
   void fun1();
}
public class Demo implements I {
	@Override
	public void fun1() {
		
		System.out.println("fun1 of interface I");
	}
      void fun2() {
    	  System.out.println("demo of function2");
      }
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.fun1();
		obj.fun2();
		System.out.println(obj.a);
	

	}

	

}
