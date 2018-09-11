
/* 문자열 내 p와 y의 개수
 * URL: https://www.welcomekakao.com/learn/courses/30/lessons/12916
 */

class Solution15 {
    boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        int p = 0, y = 0;

        for (int i=0; i<charArr.length; i++) {
            String tmp = String.valueOf(charArr[i]).toLowerCase();

            if("p".equals(tmp)) p++;
            if("y".equals(tmp)) y++;
        }

        if(p != y) answer = false;

        return answer;
    }
}
