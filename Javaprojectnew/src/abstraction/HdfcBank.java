package abstraction;

public class HdfcBank extends IcicBankAbstraction {
	public void funds() {
		System.out.println("funds of Hdfc bank...");
	}
	public void loan() {
		System.out.println("hdfc bank logic method...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank obj=new HdfcBank();
		//obj.credit();
		//obj.dedit();
		//obj.loan();
		//obj.funds();
		//obj.loan();
		IcicBankAbstraction obj1=new HdfcBank ();
		obj1.credit();
		obj1.dedit();
		obj1.loan();
		//obj1.funds();
		obj1.loan();

	}

}
