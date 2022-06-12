package firstpro2;

class Abc2
{
	static int add()	//Static Method	
	{
		int x = 10;
		int y = 20;
		int z = x+y;
		return z;
	}
}
class Xyz2
{
	void disp()		//Instance method 
	{
		int a = Abc2.add(); //Calling Static method
		System.out.println("Addition = " + a);
	}
}

public class Static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz2 r = new Xyz2();
		r.disp();
	}

}
