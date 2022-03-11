package gyub.programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Description : 전화번호 목록
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-11
 */
public class Problem42577 {

    /**
     * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
     * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
     *
     * 구조대 : 119
     * 박준영 : 97 674 223
     * 지영석 : 11 9552 4421
     * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
     * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한 사항
     * phone_book의 길이는 1 이상 1,000,000 이하입니다.
     * 각 전화번호의 길이는 1 이상 20 이하입니다.
     * 같은 전화번호가 중복해서 들어있지 않습니다.
     */
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
    }

    public static boolean solution(String[] phone_book) {
        Map<String, Integer> phoneMap = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            phoneMap.put(phone_book[i], phone_book[i].length());

        }
        for (String key: phoneMap.keySet()) {
            for (int i = 0; i < key.length(); i++) {
                if( phoneMap.containsKey(key.substring(0, i))){
                    return false;
                }
            }
        }

        return true;
    }

}
