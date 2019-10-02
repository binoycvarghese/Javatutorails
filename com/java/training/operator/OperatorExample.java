package com.java.training.operator;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 10;
		int x1;
		System.out.println(result);
		x1 = result++; // x == 10; result =11
		System.out.println(x1);
		x1 = ++result; // result =12; x =12
		System.out.println(x1);
		
		System.out.println("==================");
		
		int a = 10;

		/**
		 * 1010 =10
		 * 1's--> 0101 ==5
		 * compiler will display 2's complement of 5
		 * 
		 * i.e. -11 in binary
		 * 
		 *  or using formula
		 * formula the result of ~a is (-variable) -1 ie -10-1= -11
		 * 
		 * a = -10
		 * -(-10)-1= +10-1=9
		 * 
		 */

		System.out.println(~a);
		a = -10;
		System.out.println(~a);

		System.out.println("post - prefix ");
		int x = 10;
		System.out.println(x++);// 10 (11)
		System.out.println(x);// 11
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10

		System.out.println("shift operator");

		System.out.println(10 << 2);
		/**
		 * 0000 1010
		 * 
		 */
		// 10*2^2=10*4=40

		System.out.println(10 >> 2);// 10/2^2=10/4=2

		System.out.println("logical");

		a = 10;
		int b = 5;
		int c = 20;
		System.out.println("logical or");
		System.out.println(a > b || a < c);// true || true = true
		System.out.println("logical and");
		System.out.println(a < b && a++ > c);
		System.out.println("value of a : -->" + a);
		
		System.out.println("---------");
		System.out.println(a > b & a++ < c);// true | true = true
		System.out.println("bitwise and "+ a);

		System.out.println("ternary operator");

		String str = (a < b) ? "a is les than" : "a is greater than";
		System.out.println(str);
		
		System.out.println("instanceOf");
		Object s = new String("test");
		
		System.out.println(s instanceof Integer);
		System.out.println(s instanceof String);

	}

}
