import java.util.ArrayList;
import java.util.Arrays;

/*
 * 기능개발 (스택/큐)
 */ 
class Solution18 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] endDay = new int[100];
        int day = -1;
        
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            endDay[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}
