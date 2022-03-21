package gyub.programmers;

/**
 * Description : 타겟 넘버 [ bfs/ dfs]
 * @author Hman
 * @version 1.0.0
 * 작성일 2022-03-20
 */
public class Problem43165 {

    static int answer = 0;
    public static void main(String[] args) {

        solution(new int[]{1,1,1,1,1}, 3);
        System.out.println(answer);
    }


    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    public static void dfs(int [] numbers, int idx, int sum, int target){
        if(idx > numbers.length-1){
            if(sum == target){
                answer++;
            }
            return;
        }
        int num = numbers[idx];
        sum += (-1 * num);
        dfs(numbers, idx+1, sum, target);

        sum += (num*2);
        dfs(numbers, idx+1, sum, target);
    }

}
