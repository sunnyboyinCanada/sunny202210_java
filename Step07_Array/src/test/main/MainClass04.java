package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		Bike[] bikes = new Bike[3];
	      
	    bikes[0] = new Bike();
	    bikes[1] = new Bike();
	    bikes[2] = new Bike();
	      
	for(int i = 0; i < bikes.length; i++) {
	         bikes[i].ride();

	}
}
