class Solution {
    public boolean isHappy(int n) {
        int i = 0;
        int breakw = 100000000;
        while(n != 1){
            int temp = 0;
            i = 0;
            while(n != 0){
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = temp;

            breakw--;
            if(n == 4){
                return false;
            }
        }
        return true;
    }
}