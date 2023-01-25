package mySamples;

public class childClassdemo extends parentClassdemo{

	
	public void engine() {
		System.out.println("new engine");
	}
	
	public void colour() {
		System.out.println(colour);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClassdemo cd = new childClassdemo();
		cd.colour();
	}

}
