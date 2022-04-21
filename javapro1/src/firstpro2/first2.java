package firstpro2;

//Data Abstract

abstract class atm
{
	abstract void withdraw();
}

public class first2 extends atm
{
void withdraw()
{
	System.out.println("withdraw successfully");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first2 obj1 = new first2();
		obj1.withdraw();
	}

}
