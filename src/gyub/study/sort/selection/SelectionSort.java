package gyub.study.sort.selection;

import gyub.study.common.CommonUtil;
import gyub.study.sort.GyubSort;

public class SelectionSort implements GyubSort{
	
	/** 재귀함수 선택정렬
	 * @param arr
	 * @param selectionIdx
	 */
	private void sort2(int [] arr, int selectionIdx) {
		int index = selectionIdx;
		
		if (selectionIdx != arr.length -1) {
			for(int idx = selectionIdx+1; idx < arr.length; idx++) {
				if(arr[index] > arr[idx]) {
					index = idx;
				}
			}
			CommonUtil.swap(arr, selectionIdx, index);
			sort2(arr, selectionIdx +1);
		} 
	}

	/** 일반적인 선택정렬
	 * @param arr
	 * @return
	 */
	public void sort(int [] arr) {
		for( int selectionIdx = 0 ; selectionIdx < arr.length-1; selectionIdx++) {
			int index = selectionIdx;
			
			for( int idx = selectionIdx+1; idx < arr.length; idx ++) {
				if(arr[index] > arr[idx]) {
					index = idx;
				}
			}
			CommonUtil.swap(arr, selectionIdx, index);
		}
	};
	
	
	
}
