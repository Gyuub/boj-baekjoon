package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Description : Problem1929 문제. 소수 구하기
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-08
 */
public class Problem1929 {
    /**
     * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
     *
     * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        boolean [] list = new boolean[num2+1];
        for (int i = 2; i < list.length; i++) {
            list[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(list.length); i++){
            if(list[i]){ //true 소수
                for (int j = i*i; j < list.length; j = j+i) {
                    list[j] = false;
                }
            }
        }

        for (int i = num1; i <= num2; i++) {
            if(list[i]) sb.append(i).append("\n");
        }
        System.out.print(sb);
    }

//    public void fail() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuffer sb = new StringBuffer();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int num1 = Integer.parseInt(st.nextToken());
//        int num2 = Integer.parseInt(st.nextToken());
//
//        for (int i = num1; i <= num2; i++){
//            boolean flag = true;
//            if(i==1){
//                continue ;
//            }
//
//            for (int j = 2; j <= 7; j++){
//                if(i != j && i%j==0){
//                    flag = false ;
//                    break;
//                }
//            }
//
//            if(flag){
//                sb.append(i).append("\n");
//            }
//        }
//
//        System.out.print(sb);
//
//    }
}
