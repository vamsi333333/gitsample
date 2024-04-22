package construtors;

public class Copyconstructor {
	int b;

	Copyconstructor()
	{
		int a=10;
		System.out.println("a=:"+ a);
	}
	Copyconstructor (Copyconstructor ref)
	{
		b=ref.b;
		System.out.println("b=:"+ b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructor obj=new Copyconstructor();
		//System.out.println(obj2.a);
		

	}

}
