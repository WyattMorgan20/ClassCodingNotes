package FirstProject;

import java.util.ArrayList;

public class FirstProject {
	public static void main(String[] args) {
		String[] arr1 = new String[6]; // size is fixed
		String[] arr2 = {"John", "Smith", "Jane", "Doe"}; // initialize
		
		ArrayList<String> arrList1 = new ArrayList<>(); // size NOT fixed, dynamic
		
		System.out.println("Size of the array2 " + arr2.length);
		System.out.println("Size of the arrayList " + arrList1.size());
	

	}
}
