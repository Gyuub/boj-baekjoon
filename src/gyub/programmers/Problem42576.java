package gyub.programmers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * Description : 완주하지 못한 선수
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-11
 */
public class Problem42576 {

    /**
     * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
     *
     * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
     * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
     * completion의 길이는 participant의 길이보다 1 작습니다.
     * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
     * 참가자 중에는 동명이인이 있을 수 있습니다.
     *
     */
    public static void main(String[] args) {
        System.out.println(
                해쉬를_이용한_방법(new String[]{"a", "a", "b", "d"},
                        new String[]{"a", "b", "d"})
        );
    }

    public static String 정렬을_이용한_방법(String[] participant, String[] completion) {
        String answer = participant[participant.length-1];
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i]) ) {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }

    public static String 해쉬를_이용한_방법(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> answerMap = new HashMap<>();
        for (String str : participant) {
            int i = answerMap.getOrDefault(str, 0) + 1;
            answerMap.put(str , i);
        }
        for (String str : completion) {
            int i = answerMap.get(str) - 1;
            answerMap.put(str, i);
            if(i == 0) answerMap.remove(str);
        }


        Iterator<String> iterator = answerMap.keySet().iterator();
        answer = iterator.next();
        return answer;
    }


}
