class Solution {
    public int longestPalindrome(String s) {
        int paLength = 0;
        HashSet<Integer> indexes = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(j) == s.charAt(i)){
                    if(!indexes.contains(i) && !indexes.contains(j)){
                    indexes.add(i);
                    indexes.add(j);
                    paLength += 2;
                    }
                }
            }
        }

        if(indexes.size() != s.length()){
            paLength++;
        }

        return paLength;
    }
}