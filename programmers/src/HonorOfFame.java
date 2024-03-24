import java.util.*;
public class HonorOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> Honor = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++){
            Honor.add(score[i]);

            if (Honor.size() > k){
                Honor.remove(Collections.min(Honor));
            }
            answer[i] = Collections.min(Honor);
        }

        return answer;
    }
}
