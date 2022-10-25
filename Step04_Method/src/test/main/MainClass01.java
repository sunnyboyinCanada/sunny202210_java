package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * MyObject 객체를 하나만 생성해서 그 객체가 가지고 있는
		 * walk(), getNumber(), getGreegint() 메소드를 차례로 호출해 보세요.
		 * 단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 담으세요.
		 */
		MyObject mo = new MyObject();
		mo.walk();
		int num = mo.getNumber();
		String greet=mo.getGreeting();
		Car car = mo.getCar();
	
		mo.setNum(1);
		mo.setName("김구라");
		mo.useCar(new Car());
		
		int a =999;
		String b = "누구게";
		Car c1 = new Car();
		
		mo.setNum(a);
		mo.setName(b);
		mo.useCar(c1);
		
		mo.doSomething(2, "해골", new Car());
		mo.doSomething(a, b, c1);
	}
}
