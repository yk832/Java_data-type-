package day02;

public class Ex03_Example {

	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 20;
		int result = number1 + number2;
		System.out.println(result);
		
		boolean bool1 = result < 50;
		System.out.println(bool1);
		
		result = 5;
		System.out.println("result" + result);
		
		result = number1 - number2;
		System.out.println("result" + result);
		
		String str1 = "문자";
		int a = 10;
		System.out.println(str1 + a);
		// 문자 + 숫자 = 문자
		String str2 = a + str1;
		
		
		
		String str3 = "문자";
		int b = 10;
		System.out.println(str1 + a);
		String str4 = b + "";
		//형변환시 "" 사용
		
	
		

	}

}
