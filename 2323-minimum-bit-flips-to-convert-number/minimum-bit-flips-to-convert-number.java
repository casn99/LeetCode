class Solution {
    public int minBitFlips(int start, int goal) {
        System.gc();
        return  Integer.bitCount(start ^ goal);
    }
}