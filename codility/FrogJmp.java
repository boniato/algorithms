class Solution {
    public int solution1(int X, int Y, int D) {
        // write your code in Java SE 8
        int distance = Y - X; //Becauase it starts at X position..
        return distance % D == 0 ? distance/D : distance/D + 1;
    }
    
    public int solution2(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
