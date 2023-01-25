package mySamples;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an Object - String literal
		
		String S = "Syed Shuyab Ahmad";
		String S1 = "Syed Shuyab Ahmad";
		
		//By using new keyword
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Syed Shuyab Ahmad";
		String[] splittedString = s.split("Shuyab");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		//reverse string
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
