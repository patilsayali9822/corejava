package firstpro2;

//Inheritance
class withdraw
{
	int amt_withdraw = 20000;
}
public class first4 extends withdraw
{
	int amt_left = 5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first4 obj = new first4();
		System.out.println("Amount Withdraw = "+obj.amt_withdraw);
		System.out.println("Amount Left = "+obj.amt_left);

	}

}
