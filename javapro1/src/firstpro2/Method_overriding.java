package firstpro2;
class parent
{
	void view() // parent method
	{
		System.out.println("Parent Class");
	}
}
public class Method_overriding extends parent {
	void view() //child method   // method overriding.
	{
		System.out.println("Child Class");
		super.view();   //use super class method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		parent obj1 = new parent();
//		obj1.view();
		Method_overriding obj = new Method_overriding();
		obj.view();
		
	}

}
