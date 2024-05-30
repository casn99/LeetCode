class Solution {
    public int reverse(int x) {
        int temp;
        long reversed = 0;

        while(x != 0){
            temp = x % 10;
            x = x/10;
            reversed = reversed * 10 + temp;

            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
            
        }
        return (int) reversed;
    }
}