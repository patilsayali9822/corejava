package firstpro2;

import java.util.Scanner;

public class library {

	int AccountNum;
	String bookAuthor;
	String bookTitle;
	
	void input()
	{
		//To aceess data from user manually
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account number: ");
		AccountNum=sc.nextInt();
		System.out.println("Enter the book author name:");
		bookAuthor=sc.next();
		System.out.println("Enter the book title:");
		bookTitle= sc.next();
		sc.close();
			
		
	}
	void compute()
	{ 
		int lateDays,Latefees;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number date late the to return the Book: ");
		lateDays=sc.nextInt();
		Latefees=lateDays*5;
		System.out.println("total Late fee is :"+Latefees);
		sc.close();
	}
	void display()
	{
		System.out.println("AccountNumber ---- bookAuthorName ---- bookTitle");
		System.out.println("--"+AccountNum+" ---- "+bookAuthor+" ---- "+bookTitle);
		
	}
	public static void main(String[] args) 
	{
		library Lb= new library();
		Lb.input();
		Lb.compute();
		Lb.display();
		
	}

}