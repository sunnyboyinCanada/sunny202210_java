package test.auto;

public class SUV extends Car{
	public SUV(Engine engine) {
		super(engine);
	}
	
	public void acceleate() {
		System.out.println("앞으로 가속.");
	}
	
	public void emergencyLight() {
		System.out.println("긴급상황입니다!");
	}
	
	public void brake() {
		System.out.println("브레이크!!");
	}
	public void autodrive() {
		System.out.println("차량의 모드를 자동운전으로 바꿉니다.");
	}
}
