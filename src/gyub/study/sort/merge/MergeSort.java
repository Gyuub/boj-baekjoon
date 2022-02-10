package gyub.study.sort.merge;

import gyub.study.sort.GyubSort;

public class MergeSort implements GyubSort {

	private static int [] temp;
	
	public void sort(int [] array) {
		temp = new int[array.length];
		sort(array, 0, array.length-1);
	}
	
	private void sort(int [] array, int left, int right) {
		/**
		 * 분할 단계
		 *  정렬 되지 않은 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나누는 작업
		 *  left 는 리스트의 시작 인덱스를 말하며
		 *  right 는 리스트의 마지막 인덱스를 말한다.
		 *  시작 인덱스가 마지막 인덱스 보다 크거나 같을 경우, 더이상 분할 할 수 없다고 판단
		 */
		if(left >= right) return;
		int middle = (left + right)/2;
		
		sort(array, left, middle);
		sort(array, middle+1, right);
		merge(array, left, middle, right);
	}
	
	
	private void merge(int [] array, int left, int middle, int right) {
		/*
		 * 정복 단계
		 * 각 부분 리스트를 재귀적으로 합병 정렬을 이용해 정렬
		 * 두 부분 리스트를 다시 하나의 정렬된 리스트로 합병한다. 이때 정렬 결과가 임시배열에 저장*/
		int i = left;
		int j = middle+1;
		int index = left;
		
		// 두 배열을 비교하여 임시 배열에 오름차순으로 정렬
		while (i <= middle && j <= right) {
			if(array[i] < array[j]) {
				temp[index] = array[i];
				i++;
			}else {
				temp[index] = array[j];
				j++;
			}
			index++;
		}
		
		// 두 배열중에 아직 임시 배열에 할당되지 않은 배열의 값 할당
		while ( i <= middle) {
			temp[index] = array[i];
			index++;
			i++;
		}
		while ( j <= right) {
			temp[index] = array[j];
			index++;
			j++;
		}
		
		/*
		 * 복사단계
		 * 임시 배열에 저장된 결과를 원래 배열에 복사한다
		 * */
		for( int k = left; k <= right; k++) {
			 array[k] = temp[k];
		}
	}
	
}
