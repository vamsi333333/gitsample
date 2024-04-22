package conditionalstatement;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		/*
		int a=10, b=15, c=20;
		if(a>b && a>c)
		{
			System.out.println("a is a big");
		}
		else if (b>c)
		{
			System.out.println("b is a big");
			
		}
		else
		{
			System.out.println("c is a big");
		}
		*/
		//finding the even or odd numbers
		//int a=10;
		System.out.println("enter your choice");
	     Scanner obj=new Scanner(System.in);
	     int a=obj.nextInt();
	     
		if(a%2==0)
		{
			System.out.println("a is even number:" + a);
		}
		else 
		{
			System.out.println("a is odd number:" + a);
		}
	}

}
