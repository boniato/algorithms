class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int distance = Y - X; //Becauase it starts at X position..
        return distance % D == 0 ? distance/D : distance/D + 1;
    }
}
