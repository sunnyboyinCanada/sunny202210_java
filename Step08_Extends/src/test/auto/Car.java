package test.auto;

import test.auto.Engine;

public class Car {

	public Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		if (this.engine==null)) {
			System.out.println("Engine 객체가 없어서 달릴 수가 없어요");
			return;
		}
		System.out.println("달려요~");
	}
}
