package gyub.study.sort;

import gyub.study.sort.quick.QuickSort;
import gyub.study.common.CommonUtil;
import gyub.study.sort.bubble.BubbleSort;
import gyub.study.sort.heap.HeapSort;
import gyub.study.sort.insertion.InsertionSort;
import gyub.study.sort.merge.MergeSort;
import gyub.study.sort.selection.SelectionSort;

public class Main {


	public static void main(String[] args) {
		int [] ARRAY = CommonUtil.randomArray(100000);
		
		CommonUtil.sort(new SelectionSort(), ARRAY.clone());
		CommonUtil.sort(new BubbleSort(), ARRAY.clone());
		CommonUtil.sort(new InsertionSort(), ARRAY.clone());
		CommonUtil.sort(new QuickSort(), ARRAY.clone());
		CommonUtil.sort(new MergeSort(), ARRAY.clone());
		CommonUtil.sort(new HeapSort(), ARRAY.clone());
		
	}

}
