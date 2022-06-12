package firstpro2;

//method overloading

public class function_overloading {
	int add (int a, int b)
	{
		return a + b;
	}
	int add (int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function_overloading obj = new function_overloading();
		System.out.println(obj.add(5, 8));
		System.out.println(obj.add(5, 8, 7));

	}

}
