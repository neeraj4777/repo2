package com.del;

public class GenericTest {
	
	
	public GenericTest() {
		Integer[] intArr = {2,4,7,5,1};
		printArray(intArr);
		System.out.println();
		Double[] doubleArr = {3.4, 6.7, 2.1, 7.8};
		printArray(doubleArr);
		System.out.println();
		Character[] charArr = {'I', 'N', 'D', 'I', 'A'};
		printArray(charArr);
		System.out.println();
		Integer [] intSumArr = {1,2,3,4,5,6,7};
		int sum = sum(intSumArr);
		System.out.println("sum:" + sum);
		System.out.println(sum(1,2,3));
	}
	
	private <E> void printArray(E[] arr) {
		for (E val : arr) {
			System.out.print(val+"");
		}
	}

	private <E> void printArray(E[] arr) {
		for (E val : arr) {
			System.out.print(val+"");
		}
	}

/*/	private void printArray(Double[] doubleArr) {
		for (Double val : doubleArr) {
			System.out.print(val+"");
		}
		
	}
	private void printArray(Integer[] intArr) {
		for (Integer val : intArr) {
			System.out.print(val+"");
	*/
	public static void main(String[] args) {
		new GenericTest();
	}

}
