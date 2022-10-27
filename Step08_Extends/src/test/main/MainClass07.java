package test.main;

import test.auto.ElectricCar;
import test.auto.Engine;
import test.auto.SUV;

public class MainClass07 {

	public static void main(String[] args) {
		/*
		 *
		 *ElectricCar car1=new ElectricCar(new Engine());
		 *car1.drive();
		 *car1.charge(); 
		 */
		SUV car2=new SUV(new Engine());
		car2.acceleate();
		car2.autodrive();
		car2.brake();
		car2.emergencyLight();
	}
}
