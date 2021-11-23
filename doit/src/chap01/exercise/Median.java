package chap01.exercise;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if (a >= b)  {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} 
		// a < b
		else if(a > c) {
			return a;
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;
		
		System.out.println("세 정수 입력");
		System.out.print("a의 값: ");
		a = sc.nextInt();
		System.out.print("b의 값: ");
		b = sc.nextInt();
		System.out.print("c의 값: ");
		c = sc.nextInt();
		
		System.out.println("중앙값: " + med3(a, b, c));
	}
}
