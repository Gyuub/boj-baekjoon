package gyub.study.common;


import gyub.study.sort.GyubSort;

public class CommonUtil {

	public static <T> void sort(GyubSort t, int [] array) {
		long start,end;
		start = System.currentTimeMillis();
		t.sort(array);
		end = System.currentTimeMillis();
//		CommonUtil.printArray(array);
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //최종 실행시간
	}
	
	/**
	 * 배열 인덱스 교체
	 * @param arr
	 * @param selectIDX
	 * @param swapIDX
	 * @return
	 */
	public static int[] swap(int [] arr, int selectIDX, int swapIDX) {
		int temp = arr[selectIDX];
		arr[selectIDX] = arr[swapIDX];
		arr[swapIDX] = temp;
		return arr;
	}
	
	/**
	 * 배열 출력
	 * @param array
	 */
//	public static void printArray(int [] arr) {
//		for( int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + ",");
//		}
//		System.out.println();
//	}
	public static void printArray(int [] array) {
		try {
			StringBuilder sb = new StringBuilder();
			for(int i : array) {
				sb.append(i).append(",");
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
	
	public static int[] randomArray(int size) {
		int [] array = new int [size];
		
		int min = 1;
		int max = 1000000;
		for(int i = 0 ; i < size; i++) {
			array[i] = (int) ((Math.random() * (max - min)) + min);
		}
		return array;
	}
}
	