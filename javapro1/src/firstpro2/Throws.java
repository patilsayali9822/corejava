package firstpro2;

public class Throws {
	static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
		throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
		System.out.println("Access granted - You are old enough!");
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);
	}

}
