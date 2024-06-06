class Solution {
    public List<String> commonChars(String[] words) {
        List<String> common = new LinkedList<>();
        int[] charCount = new int[30];
        int minCount = Integer.MAX_VALUE;
        int tempCount = 0;

        for(char ch = 'a' ;  ch<= 'z'; ch++){

            minCount = Integer.MAX_VALUE;

            for(int i = 0; i < words.length; i++){

                for(int j = 0; j < words[i].length(); j++){
                    if(words[i].charAt(j) == ch){
                        tempCount++;
                    }
                }

            minCount = Math.min(tempCount, minCount);
            tempCount = 0;
            }            
            charCount[ch - 'a'] = minCount;


        }

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(charCount[ch - 'a'] > 0){
                for(int i = 0; i < charCount[ch - 'a']; i++){
                    String temp = "" + ch;
                    common.add(temp);
                }
            }
        }


        return common;
    }
}