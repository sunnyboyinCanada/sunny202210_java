package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int num1=10;
		Integer num2 =10;
		
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
	
		//문자를 숫자로 바꾸기(String type을 int type 으로 바꾼 결과값 얻어내기)
		int result4=Integer.parseInt("999"); //Integer 클래스의 static 메소드 활용
		
	}
}
