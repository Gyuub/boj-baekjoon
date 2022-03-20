package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description : 바이러스
 * @author Hman
 * @version 1.0.0
 * 작성일 2022-03-20
 */
public class Problem2606 {
    static int count = 0;
    /**
     * 신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다.
     * 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
     *
     * 예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자.
     * 1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를
     * 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다.
     * 하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.
     *
     * 어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때,
     * 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        boolean [][] list = new boolean[N+1][N+1];
        boolean visited [] = new boolean[N+1];
        for (int i = 0; i < S; i++) {
            String [] str = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            list[num1][num2] = true;
            list[num2][num1] = true;
        }
        dfs(list, visited, 1);

        System.out.println(count);
    }

    public static void dfs(boolean [][] list, boolean [] visited, int root){
        visited[root] = true;
        for (int i = 1; i < list.length; i++) {
            if(list[root][i] && !visited[i]){
                dfs(list, visited, i);
                count++;
            }
        }
    }


}
