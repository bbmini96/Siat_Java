package step01.syntax;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex04Array {

	public static void main(String[] args) {
		// 배열 Array
		// 배열의 초기 크기 지정!
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5]; // 초기 배열의 길이를 설정해야 한다

		int[] arr3;
		arr3 = new int[] { 4, 5, 6 };

//		System.out.println(arr1.length);

//		System.out.println(arr3[1]);
		
		// 배열의 모든 요소 가져오기
		// v1
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println(arr3[i]);
//		}
		
		// v2 향상된 for-each
//		for (int v: arr3) {
//			System.out.println(v);
//		}
		
		// v3 Arrays.toString()
//		System.out.println(Arrays.toString(arr3));
		
		// 다중 배열
		int[][] numbers = {
				{5, 10},
				{4, 8},
				{3, 6},
				{2, 4},
		};
		
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				System.out.println(numbers[i][j]);
//			}
//		}
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(Arrays.toString(numbers[i]));
//		}		
		
		// 문자열 배열
//		String[] alphabet = {"a", "b", null, "d", "e"};
//		for(String alpha : alphabet) {
//			System.out.println(alpha);
//		}
		
		// 얕은 복사
		int[] arr11 = {1, 2, 3};
		int[] arr12 = arr11;
		
		System.out.println(arr11);
		
		// 깊은 복사
		// 1) for
		int[] arr13 = new int[arr11.length];
		for(int i = 0; i < arr11.length; i++) {
			arr13[i] = arr11[i];
		}
//		System.out.println(arr13);
		
		// 2) clone()
		int[] arr14 = arr11.clone();
//		System.out.println(arr14[1] = 20);
//		System.out.println(arr11[1]);
		
		// 3) Arrays.copyOf(원본배열, 복사할 요소 개수)
		int[] arr15 = Arrays.copyOf(arr11, arr11.length);
//		System.out.println(arr15);
		
		

	}

}
