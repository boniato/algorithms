/**
 * 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */

class Solution2 {
    static boolean solution(String[] phone_book) {
        boolean answer = true;

        for (int i=0; i < phone_book.length - 1; i++) {
            for (int j= i+1; j < phone_book.length; j++) {
                if (phone_book[i].startsWith(phone_book[j]) || phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main (String args[]) {
        String arr[] = {"113", "12340", "123440", "12345", "98346"};
        solution(arr);
    }
}
