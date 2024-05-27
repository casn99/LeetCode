class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        HashSet<Character> charCollection= new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i;j < s.length(); j++){
                if(!charCollection.contains(s.charAt(j))){
                    charCollection.add(s.charAt(j));
                    if(charCollection.size() > longestLength){
                    longestLength = charCollection.size();
                    }
                }else{
                    charCollection.clear();
                    break;
                    
                }
            }
        }



        return longestLength;
    }
}
