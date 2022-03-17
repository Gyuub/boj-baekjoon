package gyub.programmers;

import java.util.Arrays;

/**
 * Description : 체육복 [ 탐욕법 ]
 * @author Hman
 * @version 1.0.0
 * 작성일 2022-03-17
 */
public class Problem42862 {
    /**
     * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
     * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
     * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
     * 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
     *
     * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
     * 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
     * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * 전체 학생의 수는 2명 이상 30명 이하입니다.
     * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
     * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
     * 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
     *
     */
    public static void main(String[] args) {
        System.out.println(solution(7,
                new int[]{2, 3, 4},
                new int[]{1, 2, 3, 6}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int [] list = new int[n+1];

        Arrays.sort(lost);

        //학생 기본 값 설정
        for (int i = 1; i < list.length; i++) list[i]++;

        //체육복 여벌있는 학생
        for (int i = 0; i < reserve.length; i++) list[reserve[i]]++;

        //체육복 잃어버린 학생
        for (int i = 0; i < lost.length; i++) list[lost[i]]--;

        //체육복 빌려주는 학생
        for (int i = 0; i < lost.length; i++){
            int num = lost[i];
            if(list[num] > 0) continue;
            if(num-1 > 0 && list[num-1] > 1){
                list[num-1]--;
                list[num]++;
            }else if(num+1 < list.length && list[num+1] > 1){
                list[num+1]--;
                list[num]++;
            }
        }

        for (int num: list) {
            if(num > 0) answer++;
        }


        return answer;
    }

}
