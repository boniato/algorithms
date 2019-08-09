import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
        long aCount = 0;
        long totalCount = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a')
                aCount++;
        }

        long divisor = n / s.length();
        totalCount += divisor * aCount;
        long remainder = n % s.length();

        for(int i = 0; i < remainder; i++) {
            if(s.charAt(i) == 'a')
                totalCount++;
        }

        return totalCount;                                  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
