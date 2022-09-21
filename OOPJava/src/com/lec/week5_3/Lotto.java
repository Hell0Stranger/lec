package com.lec.week5_3;

public class Lotto {
	private int[] nums;

	Lotto() {
		nums = new int[6];
	}

	public int get(int n) {
		// int n번째값을 주세요.
		// return -> nums[n-1]
		return nums[n - 1];
	}

	public void sort() {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				if (nums[i] > nums[i + 1]) {
					int tmp;
					tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
				}

			}
		}
		System.out.println("정렬이 완료 되었습니다!");
	}

	public void set(int n, int value) {
		nums[n] = value;
	}

}
