package jp.co.aforce.test;

import jp.co.aforce.test.PracticeTest8.Person;

public class Main {

	public static void main(String[] args) {
		PracticeTest8 test8 = new PracticeTest8();
        
		//1
		test8.printHello();
		
		//2
		test8.printRandomMessage();
		
		//3
		test8.printMessage("あいうえお");
		
		//4
		test8.printMessage("あいうえお",4);
		
		//5
		test8.printRectangleArea(14, 15);
		
		//6
		System.out.println(test8.getWeatherForecast());
		
		//7
		System.out.println(test8.isEvenNumber(7));
		
		//8
		System.out.println(test8.getMessage("わたなべ",true));
		
		//9
		System.out.println();
		
		//10
		System.out.println(test8.isAdult (new Person("渡邉亜美",23)));
		
		
	}

}
