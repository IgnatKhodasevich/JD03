package lesson4;

import java.util.Arrays;

public class Array10 {
	public static void main (String[] args){
	int[] [] a = {
			{2,3,1},
			{3,4,5}
		};	
	int nok = 0;
	nok = a[1][0]*a[1][1]*a[1][2];
	
	int c = 0;
	
	for(int j = 0; j < a[0].length; j++){
		c = nok / a[1][j];
		a[0][j] = a[0][j] * c;
	}
	
	for(int i = 0; i < a[1].length; i++){
		a[1][i] = nok;
	}

	Arrays.sort(a[0]);
	
	
	System.out.println(Arrays.deepToString(a));
}
}