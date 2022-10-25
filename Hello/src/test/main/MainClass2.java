// 이 클래스가 속해있는 페키지명을 밝혀 주어야 한다.
package test.main;
/*
 *  여러줄 주석입니다.
 * 	하나
 *  두울
 *  세엣
 */

//공개된 클래스 , 클래스명은 MainClass2
public class MainClass2 {//클래스의 시작
//한줄 주석입니다.
	
	/*
	 * 	메소드명 : main
	 *  run 했을 때 실행이 시작되는 아주 특별한 메소드
	 */
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		int kor=95;
		int eng=100;
		
		double average= (kor+eng)/2d;
	      System.out.println(average);
	}
}//클래스의 끝
