package test.main;

import test.mypac.MacBook;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		MacBook mac1 = new MacBook(new cpu(), new memory(), new hardDisk());
		mac1.doGame();
	
		cpu c1= new cpu();
		memory m1= new memory();
		hardDisk h1 = new hardDisk();
		
		MacBook mac2=new MacBook(c1,m1,h1);
		mac2.doGame();
	}
}
