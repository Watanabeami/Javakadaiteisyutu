package jp.co.aforce.test;

public class PracticeTest8 {
	
		
		private String[] day;
		private String[] weather;
		//練習問題１
		public void printHello() {
			System.out.println("Hello");
		}
		
		//練習問題２
		public void printRandomMessage() {
			int n = (int)(3*Math.random());
			String[] name = {"こんばんは", "こんにちは", "おはよう"};
			System.out.println(name[n]);
		}
		
		//練習問題３
		public void printMessage(String message) {
			System.out.println(message);
		}
			
		//練習問題４
		public void printMessage(String message,int count) {
			for(int i = 0; i < count; i++) {
				System.out.println(message);
			}
		}
		
		//練習問題５
		public void printRectangleArea(double width,double height) {
			System.out.println(width * height);
		}
		
		//練習問題６
		public String getWeatherForecast() {
			int n = (int)(3*Math.random());
			int m = (int)(4*Math.random());
			String[] day = {"今日","明日","明後日"};
			String[] weather = {"晴れ","曇り","雨","雪"};
			return this.day[this.n] + "の天気は" + this.weather[this.m] + "でしょう。";
		}
		//練習問題７
	    public boolean isEvenNumber(int value) {
	    	if(value % 2 == 0) {
	    		return true;
	    	} else {
	    	    return false;
	    	}
	    		
	    //練習問題８
	    public String getMessage(String name,boolean isKid) {
	    	if(isKid == true) {
	    		return "こんにちは。" + name + "ちゃん。";
	    	} else {
	    		return "こんにちは。" + name + "さん。";
	    	}
	    }
	    //練習問題９
	    public String getLongestString(String array) {
	    	
	    }
	    
	    //練習問題１０
	    class Person{
	    	private String name;
	    	private int age;
	    	
	    Person(String name,int age){
	    	this.name = name;
	    	this.age = age;
	    }
	    
	    String getName() {
	    	return name;
	    }
	    
	    int getAge() {
	    	return age;
	    }
	    public boolean isAdult(Person person) {
	    	if(person.getAge() >= 20) {
	    	return true;
	    } else {
	    	return false;
	    }
	    }
	    
	    public char[] getMessage(String string, boolean b) {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}


		
		
	    }

		
		
		}

		
