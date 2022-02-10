package gyub.study.sort.selection;

import gyub.study.common.CommonUtil;

public class Main {
	
	public static void main(String[] args) {
		int [] arr1 = {10, 2, 5, 4, 3, 6, 7, 9, 8, 1,10};
		CommonUtil.sort(new SelectionSort(), arr1);
		
		int [] arr2 = {10, 2, 5, 4, 3, 6, 7, 9, 8, 1,10};
		CommonUtil.sort(new SelectionSort(), arr2);
	}
	
	
}
