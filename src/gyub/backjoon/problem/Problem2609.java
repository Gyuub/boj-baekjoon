package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Description : Problem2609 문제. 최대공약수와 최소공배수
 * @author hman0
 * @version 1.0.0
 * Date : 2021-10-06
 */
public class Problem2609 {

    /**
     * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
     *
     * 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcdNum = gcd(num1, num2);
        System.out.println(gcdNum);
        System.out.println(num1 * num2 / gcdNum);

    }
    public static int gcd(int a , int b){
        return b == 0 ? a : gcd(b, a%b);
    }

    public void 처음짠로직(int a, int b){
        int num1 = a;
        int num2 = b;

        int [] count1 = new int[10001];
        int [] count2 = new int[10001];

        int i = 2;
        while(i <= num1){
            if(num1%i==0){
                count1[i]++;
                num1 = num1/i;
            }else{
                i++;
            }
        }
        i = 2;
        while(i <= num2){
            if(num2%i==0){
                count2[i]++;
                num2 = num2/i;
            }else{
                i++;
            }
        }
        int sum = 1;
        int max = 1;
        for (int j = 1; j < 10001; j++) {
            if(count1[j] > count2[j]){
                sum *= Math.pow(j,count1[j]);
            }else{
                if(count2[j] > 0){
                    sum *= Math.pow(j,count2[j]);
                }
            }
            if (count1[j] > 0  && count2[j] > 0){
                max *= Math.pow(j, count1[j] > count2[j] ? count2[j] : count1[j]);
            }
        }
        System.out.println(max);
        System.out.println(sum);
    }
}
