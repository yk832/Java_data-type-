package day02;

public class Ex05_CompareOperator {
			
	public static void main(String[] args) {
		// 비교연산자 
		// 변수1 [<, >, <=, >=, ==(같다), !=(같지 않다)] 변수2 
		// 변수1 < 변수2
		//기본형 , 참조형
		
		int number1 = 10;
		int number2 = 10;
		
		boolean result;
		
		
		result = number1 < number2;
		System.out.println(result);
		
		result = number1 > number2;
		System.out.println(result);
		
		result = number1 <= number2;
		System.out.println(result);

		result = number1 >= number2;
		System.out.println(result);

		result = number1 == number2;
		System.out.println(result);
		
	    result = number1 != number2;			
		System.out.println(result);

		
		String str1 = "JAVA";
		String str2 = "JAVA";
		
		result = str1 == str2;
		System.out.println(result);
		result = str1 != str2;
		System.out.println(result);
		 
		result = str1.equals(str2);
		System.out.println(result);

	


	   
	}

}
