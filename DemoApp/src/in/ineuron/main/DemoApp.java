package in.ineuron.main;

public class DemoApp {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40};
		
		for(int elem : a) {
			System.out.println(elem);
		}
		
		String name = "sachin";
		int count = name.toUpperCase().length();
		System.out.println("The length of the string is :: "+count);
		
		StringBuffer sb = new StringBuffer("viratkohli");
		int length = sb.append("INDRCB").reverse().length();
		System.out.println(length);
	}	

}
