package jp.co.aforce.test;

public class PracticeTest7 {
	public static void main(String[] args) {
		//練習問題１
		Airplane Airplane = new Airplane();
		Fighter fighter = new Fighter();
		
		Airplane.fly();
		Fighter fighter1 = new Fighter();
		fighter1.fly();
		Fighter.fight();
	}
}
