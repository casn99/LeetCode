class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        ArrayList<String> w = new ArrayList<>();
        w.addAll(Arrays.asList(words));
        w.removeIf((a) -> a.length() ==0);
        words = Arrays.copyOf(w.toArray(), w.toArray().length, String[].class);

        String answer = "";
        for(int i = words.length -1; i >=0; i--){
            if(words[i].length() != 0)
            {
                answer = answer + words[i];
            

            if(i > 0){
                answer = answer + " ";
            }
            }
        
        }
        
        return answer;
    }
}