package firstpro2;

public class Polymorphism {
	void add(int x,int y)
	{
		System.err.println("add 2 nos " + (x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("add 3 nos " + (x+y+z));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Polymorphism a = new Polymorphism();
		 a.add(5, 3);
		 a.add(3, 4, 4);

	}

}
