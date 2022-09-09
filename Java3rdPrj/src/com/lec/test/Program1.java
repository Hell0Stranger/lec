package com.lec.test;

public class Program1 {

	public static void main(String[] args) {
		
		//2번	
		int total =0;
		int[] nums = {5,2,7,4,6,90,3};
		
			for(int j=0; j<7; j++) {
				if(nums[j]!=3) 			
					total = total+ nums[j];		
			}
			System.out.println("total is"+total);
	   }
	}



// 1번
//		int[] nums = {5,2,7,4,6,90,3};
//		
//			for(int j=0; j<7; j++) {
//				System.out.println("90의 인덱스는"+nums[j]);
//				 if(nums[j]==90)
//					 System.out.println(j);
//				 	break; 
//			}	