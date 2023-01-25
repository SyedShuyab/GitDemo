package mySamples;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		String [] name = {"Syed", "Shuyab", "Ahmad"};
		
		for(int j=0;j<name.length;j++) {
			System.out.println(name[j]);
		}
		
		for(String s:name) {
			System.out.println(s);
		}

	}

}
