class Solution {
    public int mySqrt(int x) {

        long test = x;
        boolean found = false;
        while(!found){
            if(test*test > x){
                test = test/2;
            }else if((test+1)*(test+1) <= x){
                test++;
            }else{
                found = true;
            }

        }
        return (int)test;
    }
}