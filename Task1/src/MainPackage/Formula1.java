package MainPackage;

import java.util.*;


public class Formula1 {
	
	public static void main (String[] args) {
		int n = 0;
		System.out.println("Input the number of task(1-21): ");
		Scanner n1 = new Scanner(System.in);
		if (n1.hasNextInt()) {
			n = n1.nextInt();
		}
		switch (n){
		case 1:
			task1();
			break;
		case 2:
			task2();
			break;
		case 3:
			task3();
			break;
		case 4:
			task4();
			break;
		case 5: 
			System.out.println("The task is not yet done.");
			break;
		case 6: 
			task6();
			break;
		case 7: 
			task7();
			break;
		case 8: 
			task8();
			break;
		}
		
	}
	
	public static void task8 (){
		double a;
		double b;
		double c;
		System.out.println("Input a: ");
		Scanner a1 = new Scanner(System.in);
		System.out.println("Input b: ");
		Scanner b1 = new Scanner(System.in);
		System.out.println("Input c: ");
		Scanner c1 = new Scanner(System.in);
		a = a1.nextDouble();
		b = b1.nextDouble();
		c = c1.nextDouble();
		if (a+b > c & a+c>b & b+c>a) {
			System.out.println("True");
		}else{
			System.out.println("False");
			
		}
	}
	public static void task7 () {
		double x;
		double y;
		System.out.println("Input x: ");
		Scanner x1 = new Scanner(System.in);
		System.out.println("Input y: ");
		Scanner y1 = new Scanner(System.in);
		x = x1.nextDouble();
		y = y1.nextDouble();
		
		if (x >= 0 & x <= 4 & y >= 0 & y <=4){
			System.out.println("True");
		}else if (x >= 0 & x <= 5 & y >= 0 & y <= -5){
			System.out.println("True");	
		}else{
			System.out.println("False");
		}
		
	}
	
	public static void task6 () {
		double x;
		double y;
		System.out.println("Input x:");
		Scanner x1 = new Scanner(System.in);
		System.out.println("Input y: ");
		Scanner y1 = new Scanner(System.in);
		x = x1.nextDouble();
		y = y1.nextDouble();
		if (x>=-2 & x<=2 & y>=0 & y<=4) {
			System.out.println("True");
		}else if (x>=-4 & x<=4 & y>=-3 & y<=0) {
			System.out.println("True");
		}else{
			System.out.println("False");
		}
				
	}
	
	public static void task4 () {
		long x;
		long y;
		long sum;
		long dif;
		long mult;
		double quotient; 
		
		System.out.println("Input x:");
		Scanner x1 = new Scanner(System.in);
		System.out.println("Input y:");
		Scanner y1 = new Scanner(System.in);
		if(x1.hasNextLong() & y1.hasNextLong()) {
			x = x1.nextLong();
			y = y1.nextLong();		
		
		sum = x + y;
		dif = x - y;
		mult = x * y;
		quotient = (double) x / y;
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + dif);
		System.out.println("The product of numbers is " + mult);
		System.out.println("The quotient is " + quotient);
		}
	}
	public static void task3() {
		int n;
		int m = 1;
		System.out.println("Input your integer number: ");
		Scanner n1 = new Scanner(System.in);
		
		if (n1.hasNextInt()) {
			n = n1.nextInt();
			for (int i = 0; i < 4; i++) {
				m *= n % 10;
				n /= 10;
			}
		System.out.print(m);
		}else {
			System.out.println("Input integer!");
		}
		
	}
	
	
	
	public static void task2() {
		double answer1;
		int x;
		int y;
		double up;
		double down;
		
		System.out.println("Input x: ");
		Scanner x1 = new Scanner(System.in);
		System.out.println("Input y:");
		Scanner y1 = new Scanner(System.in);
		
		do {
			if (x1.hasNextInt() & y1.hasNextInt()){
				x = x1.nextInt();
				y = y1.nextInt();
				up = 1 + Math.pow(Math.sin(x + y), 2);
				down = (2 + Math.abs(x - 2*x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
				answer1 = up / down + x;
				System.out.print(answer1);
			}else{
				while (!x1.hasNextInt() & !y1.hasNextInt()){
					System.out.println("Your number are wrong! Input integer, please.");
					System.out.println("Input x: ");
					Scanner xx = new Scanner (System.in);
					x1 = xx;
					System.out.println("Input y: ");
					Scanner yy = new Scanner (System.in);
					y1 = yy;
					
				
			}
			}
		}while (x1.hasNextInt() && y1.hasNextInt());

	}	
	public static void task1 () {
		double answer; 
		int x1;
		double part1;
		double part2;
		
		System.out.println("Input x: ");
		Scanner x = new Scanner (System.in);
		do {
		
		if (x.hasNextInt()) {
				x1 = x.nextInt();
				part1 = Math.pow(x1,3)/3;
				part2 = Math.pow(x1,5)/5;
				answer = x1 - part1 + part2;
				System.out.print(answer);
			
		}else{
				while (!x.hasNextInt()){
				System.out.println("Your number is wrong! Input integer, please.");
				System.out.println("Input x: ");
				Scanner xx = new Scanner (System.in);
				x = xx;
				
				}
				
			}
		
		}
		while (x.hasNextInt());
	}
}

		
	

	

