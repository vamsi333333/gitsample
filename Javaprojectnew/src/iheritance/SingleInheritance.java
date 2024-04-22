package iheritance;
class parent{
	int a=10;
	void display() {
		System.out.println("display of the parent class...");
	}
}

public class SingleInheritance extends parent {
int b=20;
private char[] display;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj= new SingleInheritance();
System.out.println(obj.a);
System.out.println(obj.b);
obj.display();
//creating of the object class method 
 parent pobj=new parent();
 System.out.println(pobj.a);
 pobj.display();
 
 


	}

}
