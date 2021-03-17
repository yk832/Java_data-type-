package day02;

public class Ex04_Operator {

	public static void main(String[] args) {
		//Operator-연산자 : +, -, *, /, %(나눗셈 처리뒤 나머지 값) 
		//정수형 변수 2개를 선언
		int number1, number2;
		
		number1 = 10;
		number2 = 3;
		int result = number1 + number2;
		System.out.println("두 수의 합 :" + (number1 + number2));
		System.out.println("두 수의 합 :" + result);

		/* 괄호를 생략 할 경우 "두수의합" + number = 문자 + 숫자 이므로 문자로
		변경되어 10+4 가아닌 104가 출력 된다*/
		
		System.out.println("두 수의 차 :" + (number1 - number2));
		
		System.out.println("두 수의 곱 :" + (number1 * number2));

		System.out.println("두 수의 몫 :" + (number1 / number2));

		System.out.println("두 수의 몫을 뺀 나머지 :" + (number1 % number2));

		
	

	}

}
