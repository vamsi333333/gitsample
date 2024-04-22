package inheritance;
class parent{
	int a=10;
	void display()
	{
		System.out.println("display method of parent class..");
	}

	public class SingleParent extends parent{
       int b=20;
	public static void main(String[] args) {
		
		SingleParent cobj=new SingleParent();
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		  cobj.display();
	}
	}
	
}

