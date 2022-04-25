package firstpro2;

class Add
{
	void add()
	{
		int a=10;
		int b=22;
		int x;
		x=a+b;
		
		System.out.println("Addition of two no:"+x);
		
	}
}

class Sub extends Add
{
	
	
	void sub()
	{
		int a=10;
		int b=22;
		int x;
		x=a-b;
		System.out.println("Substraction of two no:"+x);
	}
	
}

class Mul extends Add
{
	
	void mul()
	{
		int a=10;
		int b=22;
		int x;
		x=a*b;
		System.out.println("multiplication of two no:"+x);
	}
	
}	
class Div extends Add
{
	
	void div()
	{
		int a=46;
		int b=322;
		int x;
		x=a/b;
		System.out.println("Division of two no:"+x);
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d=new Div();
		System.out.println("======Div class=====");
		d.add();
		d.div();
		
		Mul m= new Mul();
		System.out.println("\n=======Mul class=====");
		m.mul();
		m.add();
		
		Sub s=new Sub();
		System.out.println("\n=====sub class=====");
		s.add();
		s.sub();
		
		Add a=new Add();
		System.out.println("\n=====Add class====");
		a.add();

	}

}
