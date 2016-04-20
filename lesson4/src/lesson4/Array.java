package lesson4;

//import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		int [] a = new int[] {4,0,5,3,4,0,5,1,0};
		int [] b = new int[6];
		
		
		for (int i = 0; i < a.length; i++){
			if (a[i] == 0) {
				b[i] = a[i];
				//b = new int[1];
				
 			}
			
		}
		System.out.println(b);
	}
	
	  /*  private static ArrayList<Integer> getArray(int ... nums) {
	        ArrayList<Integer> arrNums = new ArrayList<>();
	 
	        for (int i = 0; i < nums.length; i++)
	            if (nums[i] == 0) arrNums.add(i);
	 
	        return arrNums;
	    }
	 
	    public static void main (String[] args) {
	        ArrayList<Integer> arr = getArray(1, 2, 0, 4, 0, 6, 5, 0, 6, 0);
	 
	        for (int anArr : arr) System.out.print(anArr + " ");
	    }*/
	}

