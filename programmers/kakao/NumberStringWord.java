import java.util.HashMap;
import java.util.Map;

public class NumberStringWord {
    public static void main(String[] args) {
        NumberStringWord numberStringWord = new NumberStringWord();
        String str = "1zerotwozero3";
        int res = numberStringWord.solution(str);
        System.out.println("res = " + res);
    }

    public int solution(String str) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, Integer> map = new HashMap<>();
        int i = 0;

        for (String numStr : arr) {
            map.put(numStr, i++);
        }

        for (String numStr : arr) {
            str = str.replace(numStr, map.get(numStr).toString());
        }

        answer = Integer.valueOf(str);
        return answer;
    }
    
    public int bestSolution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}
