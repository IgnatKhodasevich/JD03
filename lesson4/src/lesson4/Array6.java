package lesson4;

import java.util.Arrays;

public class Array6 {
	public static void main (String[] args) {
		int a []  = {8,2,3,4,7};
		int j = a.length - 1;
		int temp; 
		for (int i = 0; i < a.length/2; i++){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--; 
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
