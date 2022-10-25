package test.mypac;

public class Member {
	public int number;
	public String name;
	public String addr;
	
	public Member() {
		
	}
	
	public Member(int num, String name, String addr) {
		this.number=number;
		this.name=name;
		this.addr=addr;
	}
	
	public void showInfo() {
		System.out.println("번호:"+this.num+" 이름:"+this.name+" 주소:"+this.addr);
	}
}
