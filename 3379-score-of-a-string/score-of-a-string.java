class Solution {
    public int scoreOfString(String s) {
        int t = 0;
        for(int i =0; i< s.length() -1; i++){
            t += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return t;

    }
}