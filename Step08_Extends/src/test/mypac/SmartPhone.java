package test.mypac;

public class SmartPhone extends HandPhone{
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출됨");
	}
	
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	@Override
	public void takePicture() {
		super.takePicture();
		System.out.println("1000 만 화소의 사진을 찍어요!");
	}
}
