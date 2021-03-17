package day02;

public class Ex7_IncreaseDecrease {

	public static void main(String[] args) {
		// Increase(증가), Decrease(감소) = {증감}
		// 증가연산자(++)
		int number1 = 10;
		number1++; //number1 = number1 + 1  = ++number1
		System.out.println(number1);
		++number1;
		System.out.println(number1);
		
		
		int num1, num2;
		
		num1 = 12;
		num2 = 12;
		int result, result2;		
		
		result = ++num1;
		System.out.println("result1 :" + result + "num1 :" + num1);
		//1. num1 = num1 + 1;
		//2. result = num1;
		
		result2 = num2++;
		System.out.println("result2 :" + result2 + "num2 :" + num2);
		//1. result2 = num2;
		//2. num2 = num2 + 1;

		result2 = num2++;
		System.out.println(num2);
	
	}

}
