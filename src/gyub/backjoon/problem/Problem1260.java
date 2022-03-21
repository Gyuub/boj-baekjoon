package gyub.backjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Description : DFS와 BFS
 * @author Hman
 * @version 1.0.0
 * 작성일 2022-03-21
 */
public class Problem1260 {
    static boolean [][] list;
    static boolean [] visited;
    static Queue<Integer> queue = new LinkedList<>();
    static int N, M, V;
    static StringBuffer sb = new StringBuffer();
    /**
     * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
     * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
     * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
     *
     * 입력
     * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
     * 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
     * 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
     *
     * 출력
     * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        list = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        for (int i = 1; i < M+1; i++) {
            String [] str = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            list[num1][num2]= true;
            list[num2][num1]= true;

        }

        dfs(V);
        sb.append("\n");
        bfs(V);

        System.out.println(sb);
    }

    public static void dfs(int start){
        if(visited[start]){
            return;
        }
        visited[start] = true;
        sb.append(start).append(" ");
        for (int i = 1; i < N+1; i++) {
            if(list[start][i] && !visited[i]) dfs(i);
        }
    }

    public static void bfs(int start){
        visited = new boolean[N+1];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()){

            int num = queue.poll();
            sb.append(num).append(" ");

            for (int i = 1; i < N+1; i++) {
                if(list[num][i] && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }


    }
}
