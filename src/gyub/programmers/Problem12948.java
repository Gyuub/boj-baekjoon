package gyub.programmers;

/**
 * Description : 핸드폰 번호 가리기
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-10
 */
public class Problem12948 {

    public static void main(String[] args) {

        System.out.println(solution("123456789"));
    }

    public static String solution(String num) {
        int starLastIndex = num.length()-4;
        String star = num.substring(0,starLastIndex).replaceAll("[0-9]","*");
        return star + num.substring(starLastIndex);
    }
}
