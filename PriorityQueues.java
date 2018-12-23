import java.util.*;

	class MyComparator implements Comparator<Float>{
		public int compare(Float f1, Float f2) {
			if(f1 < f2)
				return -1;
			if(f1 > f2)
				return 1;
			return 0;
		}
	}

public class PriorityQueues {
	
	public static void main(String[] args) {
		PriorityQueue<Float> myList = new PriorityQueue<Float>(5, new MyComparator());
		int k;
		float x;
		
		for(k = 0; k < 5; k++) {
			x = 1000 * (float)Math.random();
			myList.add(x);
			myList.add((float)(k*100));
		}
		
		System.out.println(myList + "\n");
		
		for(k = 0; k < 5; k++) {
			x = k * 100;
			if(myList.remove(x))
				System.out.println(x + " removed");
			else
				System.out.println(x + " not found");
		}
		
		System.out.println(myList + "\n");
		
		if(!myList.remove(-10))
			System.out.println("-10 not in the list as expected");
		System.out.println(myList + "\n");
	}

}
