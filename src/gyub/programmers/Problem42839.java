package gyub.programmers;

import java.util.HashSet;
import java.util.Set;

/**
 * Description : 소수 찾기 [ 완전 탐색 ]
 *
 * @author Hman
 * @version 1.0.0
 * 작성일 2022-03-16
 */
public class Problem42839 {
    /**
     * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
     * <p>
     * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때,
     * 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
     * <p>
     * 제한사항
     * numbers는 길이 1 이상 7 이하인 문자열입니다. 9,999,999
     * numbers는 0~9까지 숫자만으로 이루어져 있습니다.
     * "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
     */
    public static void main(String[] args) {

        System.out.println(solution("17"));
    }

    public static int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int[] list = new int[10000000];
        for (int i = 0; i < list.length; i++) {
            list[i] = 1;
        }
        list[0] = 0;
        list[1] = 0;
        for (int i = 2; (i * i) <= list.length; i++) {
            for (int j = i * i; j < list.length; j += i) {
                if (list[j] == 1) {
                    list[j] = 0;
                }
            }
        }
        permutation(set, "", numbers);

        while (set.iterator().hasNext()){
            int num = set.iterator().next();
            set.remove(num);
            count += list[num];
        }

        return count;
    }


    public static void permutation(Set<Integer> set, String s1, String s2) {
        if(s1.length() > 0){
            set.add(Integer.valueOf(s1));
        }

        for (int i = 0; i < s2.length(); i++) {
            permutation(set, s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1));
        }
    }

}
