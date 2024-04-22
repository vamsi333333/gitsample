package stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		
		sb1.append("abcdefghijklmnop");
       System.out.println(sb1.capacity());
	}

}
