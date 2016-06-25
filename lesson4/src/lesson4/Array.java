package lesson4;

import java.util.Arrays;

public class Array {
	
	//public static void main(String[] args){
		
	//}
	
	public static void taskArray1(String[] args) {
	int num[] = {2, 3, 0, 0, 4, 3};
	int numZ[] = new int[6];
	int a = 0; 
	for (int i = 0; i < num.length; i++){
		if (num[i] == 0){
			numZ[a] = i;
			a++;
			
			
		}
	}
	System.out.println(Arrays.toString(numZ));
	}
}