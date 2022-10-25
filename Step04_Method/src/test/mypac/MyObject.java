package test.mypac;

public class MyObject {
	public void walk() {
		System.out.println("걸음을 걸어요.");
	}
	
	public int getNumber() {
		return 10;
	}
	
	public String getGreeting() {
		return "안녕하세요";
	}
	
	public Car getCar() {
		return new Car();
	}
	
	public void setNum(int num) {
		System.out.println("num: " + num);
	}
	
	public void setName(String name) {
		System.out.println("name: " + name);
	}
	
	public void useCar(Car car) {
		car.drive();
	}
	
	public void doSomething(int num, String msg, Car c) {
		System.out.println("무언가를 작업합니다.");
	}
}
