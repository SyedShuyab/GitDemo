package mySamples;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		d.getData();
		String s = d.getData1();
		System.out.println(s);
		//calling other call method
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();
	}
	// void
	public void getData() {
		System.out.println("Hellow World");
		
	}
	//string
	public String getData1() {
		System.out.println("Hellow World");
		return "Syed Shuyab Ahmad";
		
	}
	
	//using static no need to create object
	public static String getData2() {
		System.out.println("From Static Hellow World");
		return "Syed Shuyab Ahmad";
		
	}
	


}
