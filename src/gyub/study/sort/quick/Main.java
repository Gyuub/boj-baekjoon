package gyub.study.sort.quick;

import gyub.study.common.CommonUtil;

public class Main {

	public static void main(String [] args) {
		int [] arr = {3,7,8,1,5,9,6,10,2,4};
		CommonUtil.sort(new QuickSort(), arr);
		CommonUtil.printArray(arr);
	}
	
	
}

