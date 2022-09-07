package com.lec.ch4.arr;

public class LottoApp3 {

	public static void main(String[] args) {
		int[] lotto1 = {1,2,3,4,5,6};
		int[] lotto2 = {7,8,9,10,11,12,20};
		int[] lotto3 = {3,5,8,23,25,32};
		
		System.out.println("=======다차원 배열로 변경========");
		
		//1차배열을 이끌 수 있는 이름만 3개 준비된 것.
		int[][] lottos = new int[3][]; 
		// lottos[0] = 의 이름
		
		lottos[0] = lotto1;
		lottos[1] = lotto3;
		lottos[2] = lotto2;
		
			for(int i=0; i<6; i++)
				System.out.printf("%d ", lottos[0][i]);
			
			System.out.println();
				
			for(int i=0; i<6; i++)
				System.out.printf("%d ", lottos[1][i]);
			
			System.out.println();
				
			for(int i=0; i<7; i++)
				System.out.printf("%d ", lottos[2][i]);
			
			System.out.println();
			
		System.out.println("===========첫번째출력============");

		for(int j=0; j<3; j++) {
			for(int i=0; i<6; i++)
				System.out.printf("%d ", lottos[j][i]);
		 System.out.println();
		} 
		
		System.out.println("=========부대원바꾸기=============");
		
		//Lottos의 첫번째와 두번째의 항목을 바꾸시오
		//lottos[0] <-> lottos[1] : 부대원 스왑
		
		int[] tmp;
		tmp = lottos[0];
		lottos[0] = lottos[1];
		lottos[1] = tmp;
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<6; i++)
			   System.out.printf("%d ", lottos[j][i]);
			System.out.println();
		}
		
		
		
	}

}
