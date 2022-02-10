package gyub.study.sort.heap;

import gyub.study.common.CommonUtil;

public class HeapTest {
	public static void heapSort(int[] arr) {
        int n = arr.length;

        // maxHeap을 구성
        // n/2-1 : 부모노드의 인덱스를 기준으로 왼쪽(i*2+1) 오른쪽(i*2+2)
        // 즉 자식노드를 갖는 노트의 최대 개수부터
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i); // 일반 배열을 힙으로 구성
        }

        for (int i = n - 1; i > 0; i--) {
            CommonUtil.swap(arr, 0, i);
            heapify(arr, i, 0); // 요소를 제거한 뒤 다시 최대힙을 구성
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        // 왼쪽 자식노드
        if (l < n && arr[p] < arr[l])
            p = l;
        // 오른쪽 자식노드
        if (r < n && arr[p] < arr[r])
            p = r;

        // 부모노드 < 자식노드
        if (i != p) {
        	CommonUtil.swap(arr, p, i);
            heapify(arr, n, p);
        }
    }
}
