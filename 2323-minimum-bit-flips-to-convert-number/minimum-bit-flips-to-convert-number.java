class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = Integer.bitCount(start ^ goal);
        
        
        return xor;
    }
}