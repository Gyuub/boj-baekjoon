package gyub.programmers.devmatching;

import java.util.Arrays;

/**
 * Description : 행렬 테두리 회전하기
 *
 * @author Hman
 * @version 1.0.0
 * 작성일 2022-03-22
 */
public class Problem77485 {
    static int[][] matrix;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}})));
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        matrix = new int[rows + 1][columns + 1];

        //행렬
        int num = 1;
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < columns + 1; j++) {
                matrix[i][j] = num++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int row1 = queries[i][0];
            int col1 = queries[i][1];
            int row2 = queries[i][2];
            int col2 = queries[i][3];

            answer[i] = rotation(col1, row1, col2, row2);
        }

        return answer;
    }

    public static int rotation(int col1, int row1, int col2, int row2) {
        int temp = matrix[row1][col1];
        int min = 99999;
        for (int k = row1; k < row2; k++) {
            min = Math.min(min, matrix[k + 1][col1]);
            matrix[k][col1] = matrix[k + 1][col1];
        }

        for (int k = col1; k < col2; k++) {
            min = Math.min(min, matrix[row2][k + 1]);
            matrix[row2][k] = matrix[row2][k + 1];
        }

        for (int k = row2; k > row1; k--) {
            min = Math.min(min, matrix[k - 1][col2]);
            matrix[k][col2] = matrix[k - 1][col2];
        }

        for (int k = col2; k > col1; k--) {
            min = Math.min(min, matrix[row1][k - 1]);
            matrix[row1][k] = matrix[row1][k - 1];
        }
        matrix[row1][col1 + 1] = temp;
        min = Math.min(min, matrix[row1][col1 + 1]);
        return min;
    }
}
