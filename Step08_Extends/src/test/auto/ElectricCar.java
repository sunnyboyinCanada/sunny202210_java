package test.auto;

public class ElectricCar extends Car{

	public ElectricCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	public void charge() {
		System.out.println("충전을 해요!");
	}
}
