class Solution {
   public int brokenCalc(int X, int Y) {
        int multiple = 1, res = 0;
        while (X * multiple < Y) {
            multiple <<= 1;
            res++;
        }
        int diff = X * multiple - Y;
        while (diff > 0) {  
            res += diff / multiple;
            diff -= diff / multiple * multiple;
            multiple >>= 1;
        }
        return res;
    }
}