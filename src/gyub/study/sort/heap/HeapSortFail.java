package gyub.study.sort.heap;

import gyub.study.common.CommonUtil;
import gyub.study.sort.GyubSort;

public class HeapSortFail  implements GyubSort {
	
	public void sort (int [] array) {
		int size = array.length;
		int maxRootIndex = (size / 2) - 1;
		
		//  최대힙 상태로 변환
		for(int n = maxRootIndex ; n > -1 ; n--) {
			heapify(array, n, size);
		}
		
		// 정렬
		for(int i = array.length-1; i > 0; i--) {
			CommonUtil.swap(array, i, 0);
			int rootIndex = (i / 2) - 1;
			int lastIndex = i;
			
			//  최대힙 상태로 변환
			for(int n = rootIndex ; n > -1 ; n--) {
				heapify(array, n, lastIndex);
			}
			
		}
		//System.out.println("최종");
		//CommonUtil.printArray( array);
	} 
	
	private void heapify(int [] array, int root, int size) {
		int leftNode =  2 * root + 1;
		int rightNode =  2 * root + 2;
		int maxNode = leftNode;
		
		if(leftNode >= size)return;
		
		if( rightNode < size && array[leftNode] < array[rightNode] ) {
			maxNode = rightNode;
		}
		
		//System.out.println("rootIDX : "+ root + " maxNode : " + maxNode);
		//System.out.println("root : "+ array[root] + " maxNode : " + array[maxNode]);
		
		if( array[root] < array[maxNode] ) {
			CommonUtil.swap(array, root, maxNode);
			//CommonUtil.printArray(array);
		}
		
		if(maxNode <= size/2 ) heapify(array, maxNode, size);
	}
}
