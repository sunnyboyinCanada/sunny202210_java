package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		Member m1= new Member();
		m1.number=2;
		m1.name="해골";
		m1.addr="행신동";
		
		Member m2 = new Member(1, "김구라", "노량진");
		
		m1.showInfo();
		m2.showInfo();
	}
}
