package polymorphism;


	class ptest{
		void sum(){
			System.out.println("the print of the parent class...");
			
		}
	}
	class ctest1 extends ptest{
		void sum() {
			System.out.println("the print of the ctest...");
		}
	}
	public class MethodRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodRiding obj=new MethodRiding();
	//ctest1 dobj1=new ctest1();
	//dobj1.sum();
		//ptest obj2=new ptest();
       //obj2.sum();
       ptest obj3=new ctest1();
       obj3.sum();
	}

	
	
	
	}

	
	


