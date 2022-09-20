package com.lec.test;

public class Test1 {

	public static void main(String[] args) {
		
		//다음 nums 배열에 값의 개수가 몇 개인지 구하는 코드를 작성하시오.

		// 0은 값이 없는 것으로 간주한다.
//		int[] nums = {10,30,20,30,40,60,60,80,0,0};  
//		int length = 10; // 위의 배열의 크기
//		int count = 0;
//		int total = 0; 
//		
//			for(int i =0; i<length; i++) 
//				if(nums[i]!=0)
//					total += nums[i];
//			
//			
//		System.out.printf("count is %d\n", count);
//		System.out.printf("total is %d\n", total);
		
		
		
		
//		농부가 사과를 수확하려고 한다.  밭에 있는 사과나무의 갯수는 10개인데, 나무마다 열린 사과의 갯수가 일정하지 않다. 
//
//		그 나무마다 달린 사과의 갯수가 다음과 같다고 할 때 농부가 수확하게 되는 사과의 개수는 총 몇 개일까? 그것을 알아보는 코드를 작성하시오. 
//
//		1번 나무 - 2개
//		2번  나무 - 3개
//		3번  나무 - 2개
//		4번  나무 - 1개
//		5번  나무 - 0개
//		6번  나무 - 6개
//		7번  나무 - 3개
//		8번  나무 - 1개
//		9번  나무 - 4개
//		10번  나무 - 0개
		
		int[] appleTrees = {2,3,2,1,0,6,3,1,4,0};		
		int myApple = 0;		
		for(int i=0; i<appleTrees.length; i++)
			if(i%2==0)
				myApple += appleTrees[i];		
		System.out.printf("사과의 총 갯수는 %d\n", myApple);
		
		
		
		
		
//		다음 nums 배열에 포함된 값에서 홀수번째의 총합을 구하는 코드를 작성하시오.

		// 0은 값이 없는 것으로 간주한다.
//					 0   1   2  3  4  5  6 7
//					 1   2   3  4  5
//		int[] nums = {10,30,20,30,40,60,60,80,0,0};  
//		int length = 10; // 위의 배열의 크기	
//		int total= 0;
//		
//			for(int i =0 ; i <length; i++) 
//				if (i%2==0)
//					total += nums[i];
//
//		System.out.printf("total is %d\n", total);
			
	}

}
