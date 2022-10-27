package test.main;

import test.mypac.Random;

public class Quiz1 {
	public static void main(String[] args) {
			//1.
			String[] items={"cherry", "apple", "banana", "melon", "7"};
			Random ran=new Random();
			int ranNum=ran.nextInt(5);
				System.out.println(items[ranNum]);
	
			//2
			int option1=ran.nextInt(5);
			int option2=ran.nextInt(5);
			int option3=ran.nextInt(5);
				System.out.println(items[option1]+" | "+items[option2]+" | "+items[option3]);
    
			boolean result = option1==option2 && option1==option3;
			String result2 = result ? "축하합니다. 상금은 관리소에서 전달해드립니다." : "꽝입니다. 다시 하시겠습니까?";
				System.out.println(result2);
	}
}
