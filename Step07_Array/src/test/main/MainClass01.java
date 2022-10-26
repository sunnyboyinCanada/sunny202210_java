package test.main;

public class MainClass01 {
	public void main(String[] args) {
		int[] nums= {10, 20, 30, 40, 50};
	
		double[] nums2= {10.1, 10.2, 10.3, 10.4, 10.5};
		
		boolean[] truth = {true, false, false, true,true};
		
		String[] names = {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
	
		int result1=nums[0];
		double result2=nums2[1];
		boolean result3=truth[2];
		String result4=names[3];
		
		int[] cloned = nums.clone();
		int[] cloned2 = nums.clone();
		int[] cloned3 = nums.clone();
		int[] copied=nums;
		int size=nums.length;
	}
}
