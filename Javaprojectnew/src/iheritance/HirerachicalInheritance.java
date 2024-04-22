package iheritance;

class parent {
	int a=10;
	void display()
	{
		System.out.println(a);
	}
}

	class Dc1 extends parent
	{
		void show () {
			System.out.println("show of the method1...");
			
		}
	}
		class Dc2 extends parent{
			void show() {
				System.out.println("show of the method2...");
			}
		}
		
	public class HirerachicalInheritance extends parent {
int b=20;
	public static void main(String[] args) {
		
		HirerachicalInheritance obj=new HirerachicalInheritance();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.display();
		Dc1 obj2=new Dc1();
		obj2.show();
		System.out.println(obj2.a);
		
		

	}

	}
