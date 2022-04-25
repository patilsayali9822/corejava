package firstpro2;

class x {
	void disp()
	{
		System.out.println("Display Call");
	}
}
class y extends x {
	void Disp()
	{
		System.out.println("Display Method call");
	}
}
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 y call = new y();
 call.disp();
 call.Disp();
	}

}