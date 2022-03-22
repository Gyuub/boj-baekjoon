package gyub.programmers.devmatching;


/**
 * Description : 로또의 최고 순위와 최저 순위
 * @author Hman
 * @version 1.0.0
 * 작성일 2022-03-22
 */
public class Problem77484 {
    static boolean [] lottoNumber = new boolean[46];
    static int [] winCountRank = new int[]{6, 6, 5, 4, 3, 2, 1};
    public static void main(String[] args) {

    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int count = 0;
        int zero = 0;

        for (int i = 0; i < win_nums.length; i++) lottoNumber[win_nums[i]] = true;

        for (int i = 0; i < lottos.length; i++) {
            int num = lottos[i];

            if(num == 0 ) zero++;

            if(lottoNumber[num]){
                count++;
            }
        }


        answer = new int[]{winCountRank[count+zero], winCountRank[count]};


        return answer;
    }
}
