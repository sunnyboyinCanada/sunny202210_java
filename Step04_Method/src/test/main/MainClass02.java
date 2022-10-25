package test.main;

import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
	System.out.println("안녕하세요");
	System.out.println(999);
	System.out.println(true);
	System.out.println("a");
	
	MyObject mo = new MyObject();
	mo.send();
	mo.send(1);
	mo.send("김구라");
	mo.send(new Car());
		
		
 }
}
