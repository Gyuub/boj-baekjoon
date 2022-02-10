package gyub.study.sort.insertion;

import gyub.study.common.CommonUtil;
import gyub.study.sort.GyubSort;

public class InsertionSort implements GyubSort{

	public static void sort2(int[] arr, int idx) {
		if( idx < arr.length) {
			int loopCnt = idx;
			while (loopCnt > 0 &&arr[loopCnt-1] > arr[loopCnt] ) {
				CommonUtil.swap(arr, loopCnt-1, loopCnt);
				CommonUtil.printArray(arr);
				loopCnt--;
			}
			sort2(arr, idx++);
		}
		
	}
	public void sort(int [] arr) {
		for( int idx = 0; idx < arr.length; idx++ ) {
			int loopCnt = idx;
			while (loopCnt > 0 &&arr[loopCnt-1] > arr[loopCnt] ) {
				CommonUtil.swap(arr, loopCnt-1, loopCnt);
				//CommonUtil.printArray(arr);
				loopCnt--;
			}
		}
	}
}
