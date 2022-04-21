package firstpro2;

//Polimorphism

public class first3 {
	void add(int x,int y)
	{
		System.out.println("Add 2 numbers "+(x+y));
	}
	void add(int x, int y, int z)
	{
		System.out.println("Add 3 numbers "+(x+y+z));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first3 add = new first3();
		add.add(3, 7);
		add.add(7, 9, 8);

	}

}
