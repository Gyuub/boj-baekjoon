package gyub.programmers;

import java.util.*;

/**
 * Description : 베스트앨범
 *
 * @author hman0
 * @version 1.0.0
 * Date : 2022-03-12
 */
public class Problem42579 {

    /**
     * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
     * <p>
     * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
     * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
     * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
     * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
     * <p>
     * 제한사항
     * <p>
     * genres[i]는 고유번호가 i인 노래의 장르입니다.
     * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
     * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
     * 장르 종류는 100개 미만입니다.
     * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
     * 모든 장르는 재생된 횟수가 다릅니다.
     * 입출력 예
     * genres	plays	return
     * ["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
     * 입출력 예 설명
     * classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.
     * <p>
     * 고유 번호 3: 800회 재생
     * 고유 번호 0: 500회 재생
     * 고유 번호 2: 150회 재생
     * pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.
     * <p>
     * 고유 번호 4: 2,500회 재생
     * 고유 번호 1: 600회 재생
     * 따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.
     */
    public static void main(String[] args) {
        System.out.println(solution(
//                new String[]{"classic", "pop", "classic", "classic", "pop"},
//                new int[]{500, 600, 150, 800, 2500}
                new String[]{"classic", "pop", "classic", "classic", "pop", "zazz", "zazz"},
                new int[]{500, 600, 150, 800, 2500, 2100, 1000}
        ));
    }

    public static List solution(String[] genres, int[] plays) {
        List list = new ArrayList();
        Map<String, Integer> genresPlayMap = new HashMap<>();
        Map<String, Map<Integer, Integer>> playMap = new HashMap<>();


        //1.장르별 재생횟수 총합
        for (int i = 0; i < genres.length; i++) {
            int count = genresPlayMap.getOrDefault(genres[i], 0) + plays[i];
            genresPlayMap.put(genres[i], count);
            Map<Integer, Integer> temp = playMap.getOrDefault(genres[i], new HashMap<>());
            temp.put(i, plays[i]);
            playMap.put(genres[i], temp);
        }

        //2.재생횟수 Top2
        ArrayList genresKey = new ArrayList(genresPlayMap.keySet());
        genresKey.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return genresPlayMap.get(o2) - genresPlayMap.get(o1);
            }
        });

        //3.재생횟수 많은 것 중, 고유번호 낮은 것
        for (int i = 0; i < genresKey.size(); i++) {
            String key = (String) genresKey.get(i);
            ArrayList playKeys = new ArrayList(playMap.get(key).keySet());
            playKeys.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) { return playMap.get(key).get(o2) - playMap.get(key).get(o1); }
            });

            for (int j = 0; j < playKeys.size() ; j++) {
                if(j == 2) break;
                list.add(playKeys.get(j));
            }
        }



        return list;
    }


}
