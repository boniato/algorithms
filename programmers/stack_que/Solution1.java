/** 
 * 프린터
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 **/

import java.util.*;

class Solution1 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities) {
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!que.isEmpty()) {
            Integer i = que.poll();
            if(i == priorities[size - answer]) {
                answer++;
                l--;
                if(l<0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}
