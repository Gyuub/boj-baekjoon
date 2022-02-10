package gyub.study.sort.heap;

import gyub.study.common.CommonUtil;
import gyub.study.sort.GyubSort;

public class HeapSort implements GyubSort {
	/**
	 * Heap Sort 
	 * 이진트리의 형태를 갖추고 있으며,
	 * 이진트리는 자식의 노드가 2개이 이하인 노드를 뜻함. 
	 * 
	 * 여기서 Heap sort 는 완전이진트리의 형태를 갖추고 있음
	 * 루트 노드부터 시작해서 자식 노드가 왼쪽 자식 노드 부터 채워지는 형태
	 *  
	 *  Heap : 힙은 최솟값이나 최댓값을 빠르게 찾기 위해 '완전이진트리'를 기반으로 하는 트리이다.
	 *  이러한 힙은 최대힙과 최소힙이 있다.
	 *   - 최대힙 : '부모노드'가 '자식노드'보다 큰 힙
	 *   - 최소힙 : '자식노드'가 '부모노드'보다 큰 힙
	 *   
	 *   heap sort는 merge sort와 다르게 별도로 추가적인 배열이 필요하지 않다는 점에서,
	 *   몹시 효율적입니다. 또한 항상 O(N * log N ) 을 보장한다.
	 * */
	
	@Override
	public void sort(int[] array) {
		int size = array.length;
		
		// 최대 힙 상태 변환
		for( int i = (size/2) -1 ; i > -1; i--) {
			heapify(array, i, size);
		}
		
		// 정렬
		for( int j = size -1 ; j > 0; j--) {
			CommonUtil.swap(array, 0, j);
			heapify(array, 0, j);
		}
		
	}
	
	
	private void heapify(int [] array, int rootNode, int size) {
		int left = 2*rootNode +1;	// 왼쪽 노드 
		int right = 2*rootNode +2;	// 오른쪽 노드
		int index = rootNode;
		
		// 좌측 & 우측 중 큰 값 확인
		if(left < size && array[left] > array[index]) {
			index = left;
		}
		
		if(right < size && array[right] > array[index]) {
			index = right;
		}
		
		// 변경이후 자식 노드 최대힙 상태로
		if(rootNode != index) {
			CommonUtil.swap(array, rootNode, index);
			heapify(array, index, size);
		}
	}
	

}


