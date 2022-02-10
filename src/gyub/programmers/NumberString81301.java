package gyub.programmers;

/**
 * Description : 카카오 채용연게형 인턴쉽 , 숫자 문자열과 영단어.<br>
 * Date : 2021. 8. 31.<br>
 * History :<br>
 * - 작성자 : Hman, 날짜 : 2021. 8. 31., 설명 : 최초작성<br>
 *
 * @author Hman
 * @version 1.0
 */
public class NumberString81301 {
	final static String [] word = getWord();
	
	public static void main(String[] args) {
		String str = "one4seveneight";
		solution(str);
	}
	
	public static int solution(String str) {
		for(int i = 0 ; i < word.length; i++) {
			str = str.replaceAll(word[i], ""+i);
		}
		System.out.println(str);
		return Integer.parseInt(str);
	}
	
	/**
	 * 영단어 배열 반환
	 * @return String [] 
	 */
	public static String [] getWord() {
		return new String []{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	}

}
