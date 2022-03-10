package gyub.programmers;


/**
 * Description : 행렬의 덧셈
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-10
 */
public class Problem12950 {

    /**
     * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
     * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
     */
    public static void main(String[] args) {
        solution(new int[][]{{1, 2},{3, 4}}, new int[][]{{1, 2},{3, 4}});
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int [][] sum = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }
}
