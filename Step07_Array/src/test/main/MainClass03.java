package test.main;

import java.io.Console;

public class MainClass03 {
	public static void main(String[] args) {
		String[] names=new String[3];
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		//System.out.println(names[0]);
		//System.out.println(names[1]);
		//System.out.println(names[2]);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
