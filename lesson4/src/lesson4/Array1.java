package lesson4;

public class Array1 {
	public static void main(String[] args){
		int num[] = {3,1,5,6,7,1,2,10,8,4,6,11};
		int sum = 0;
		
		for (int i = 0; i < num.length; i++){
		if (num [i] == i) {
			sum = sum + i;		
		}
		}
		System.out.println(sum);
	}
}
