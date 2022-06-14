package org.java.oop;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		cal.add(100, 200);
		cal.sub(100, 200);
		cal.div(100, 200);
		cal.multi(100, 200);
		
		//Scanner 이용
		System.out.println("===== Scanner 계산기 =====");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int num1=scn.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int num2=scn.nextInt();
		
		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.div(num1, num2);
		cal.multi(num1, num2);
		
		scn.close();
		
	}

}
