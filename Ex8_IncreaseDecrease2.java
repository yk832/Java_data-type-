package day02;

public class Ex8_IncreaseDecrease2 {
	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 10;
		int result;
		
		result = ++number1 + number2++;
		//21
		//1. result = 11 + 10 = 21
		//11+11
		System.out.println("1. result :" + result);
		System.out.println("num1 ="+number1+"num2 ="+number2);
		
		result = --number1 + number2++;
		//21
		//2. result = 10 + 11
		//10+12
		System.out.println("2. result :" + result);
		System.out.println("num.1:"+number1+"num.2:"+number2);
		result = number1++ + number2--;
		//22
		//3. result = 10 + 12
		//11+11
		System.out.println("3. result :" + result);
		System.out.println("num1 :"+number1+"num 2:"+number2);
		result = number1++ + --number2;
		//21
		//4. result = 11 + 10
		//12+10
		System.out.println("4. result :" + result);
		System.out.println("num1:"+number1+"num2:"+number2);
		
	}


}
