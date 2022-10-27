package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		
		SmartPhone p2 = (SmartPhone)p1;
		
		p2.doInternet();
	}
}
