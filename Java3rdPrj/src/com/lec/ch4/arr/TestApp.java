package com.lec.ch4.arr;

public class TestApp {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		int num; 
		
//		for(int i =0; i<10; i++) {
//			num = nums[i];
//			System.out.printf("%d ",num);
//		}
		
		// ★for문 사용할 때 고려할 것★
		// 1.특정수 만큼 반복하고 싶다면 ? 원하는 수가있다면 원하는 수를 적어라
		// 2.반복할 때 인덱스를 활용하라 (규칙적인 수를 만들기 위해서)
		
		
//		for(int i=10; 0<i; i--)
//			System.out.println(nums[i-1]);
//		
//		for(int i=0; i<10; i++)
//			System.out.println(nums[10-i]);
		
//		for(int i=0; i<10; i++)
//			if(nums[i]%2==0)
//				System.out.println(nums[i]);
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<10; i++)
				if(i%2==1)
					System.out.printf("%d", nums[i]);
		}
		
	}

}
