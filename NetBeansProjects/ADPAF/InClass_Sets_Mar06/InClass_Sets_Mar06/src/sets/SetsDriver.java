package sets;

import java.util.*;

public class SetsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		List<String> colors =
	Arrays.asList("red","orange","yellow","green","blue","indigo","violet");
		hashSet.addAll(colors);
		linkedSet.addAll(colors);
		treeSet.addAll(colors);
		System.out.println("Original List output "+colors );
		System.out.println("HashSet output "+hashSet);
		System.out.println("LinkedHashSet output "+linkedSet);
		System.out.println("TreeSet Output "+treeSet);
		System.out.println();
		
		hashSet.add(null);hashSet.add(null);
//		linkedSet.add(null); treeSet.add(null);
		System.out.println("Updated HashSet output "+hashSet);
//		System.out.println("Updated LinkedHashSet output "+linkedSet);
//		System.out.println("Updated TreeSet Output "+treeSet);
		
		System.out.println("Contain red color "+hashSet.contains("red"));
		System.out.println("Equal method "+hashSet.equals(linkedSet));
		
	//    CHECK PERFORMANCE	
		Set<Integer> hashSet1 = new HashSet<>();
		Set<Integer> linkedSet1 = new LinkedHashSet<>();
		Set<Integer> treeSet1 = new TreeSet<>();
	
		Random  rand = new Random();
		// NO ORDER IN ARRANGING THE ELEMENTS
		long startTime = System.nanoTime();
		for (int i = 0; i<= 10000000; i++) {
			hashSet1.add(rand.nextInt());
		}
		long endTime = System.nanoTime();
		long time = endTime - startTime;
		System.out.println("It takes in hash time in nano second is "+time);
		// MAINTAIN THE INSERTED ORDER TO DISPLAY THE ELEMENTS
		long startTime1 = System.nanoTime();
		for (int i = 0; i<= 10000000; i++) {
			linkedSet1.add(rand.nextInt());
		}
		long endTime1 = System.nanoTime();
		long time1 = endTime1 - startTime1;
		System.out.println("It takes in linkedhash time in nano second is "+time1);
		// IT WILL DISPLAY THE ELEMENTS IN ASCENDING FORM
		long startTime2 = System.nanoTime();
		for (int i = 0; i<= 10000000; i++) {
			treeSet1.add(rand.nextInt());
		}
		long endTime2 = System.nanoTime();
		long time2 = endTime2 - startTime2;
		System.out.println("It takes in treeset time in nano second is "+time2);
		
		
			
			
		
		
	}

}
