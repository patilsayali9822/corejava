package firstpro2;


class A {
	void one() {
		System.out.println("A class have one method");

	}
}

class B extends A {
	void two() 
	{
		System.out.println("We are in 2nd method of class B ");
	}

	void three() {
		System.out.println("We are in 3rd method of class B");
	}
}

class C extends B {

	void four() {
		System.out.println("We are in 4th method of class C");
	}

	void five() {
		System.out.println("We are in 5th method of class C");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.one();
		c1.two();
		c1.three();
		c1.four();
		c1.five();

	}

}
