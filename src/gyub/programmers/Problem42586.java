package gyub.programmers;


import java.util.*;

/**
 * Description : 기능개발 [ 스택/큐 ]
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-14
 */
public class Problem42586 {

    /**
     *프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
     *
     * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
     *
     * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
     *
     * 제한 사항
     * 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
     * 작업 진도는 100 미만의 자연수입니다.
     * 작업 속도는 100 이하의 자연수입니다.
     * 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
     * 입출력 예
     * progresses	speeds	return
     * [93, 30, 55]	[1, 30, 5]	[2, 1]
     * [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
     */
    public static void main(String[] args) {
        System.out.println(Math.ceil(2.1));;

        System.out.println(
            Arrays.toString(solution(
                    new int[] {93, 30, 55},
                    new int[] {1, 30, 5}
            )));
    }

    public static int [] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();


        //Queue 에 값 셋팅
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            queue.add(day);
        }

        //초기값 셋팅
        int temp = queue.peek();
        int size = queue.size();

        while( !queue.isEmpty() ) {
            int peek = queue.peek();

            //temp는 앞에 번지를 의미하고, 앞 번지보다 작거나 같으면 poll
            if(temp >= peek){
                queue.poll();
            }else{
                //temp값 변경되기전 사이즈값 - 변경후 사이즈값 = poll 갯수 의미
                answer.add(size - queue.size());
                size = queue.size();
                temp = queue.poll();
            }
        }
        //마지막 인덱스는 넣어줘야함
        answer.add(size);

        return answer.stream().mapToInt(o -> o.intValue()).toArray();
    }


    public static List<Integer> solution2(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack stack = new Stack();

        for (int i = progresses.length-1; i > -1; i--) {
            int day = (int) Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            stack.push(day);
        }
        int day = (int)stack.peek();
        int size = stack.size();
        while (!stack.empty()){
            int peek = (int) stack.peek();
            if(day >= peek){
                stack.pop();
            }else{
                answer.add(size - stack.size());
                size = stack.size();
                day = (int) stack.pop();
            }
        }
        answer.add(size);

        return answer;
    }



}
