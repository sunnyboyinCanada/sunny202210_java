package test.main;

import test.mypac.Phone;
import test.mypac.HandPhone;

public class MainClass04 {
	public static void main(String[] args) {
		
		Object p3=new HandPhone();
		Phone p2= (Phone)p3;
		HandPhone p1= (HandPhone)p3;
	}
}
