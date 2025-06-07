class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() <= 1){
            return s.length();
        }

        HashSet<Character> c = new HashSet<>();
        int i =0;
        int j = 1;
        int max= 1;

        c.add(s.charAt(0));

        while(j < s.length()){
            char t = s.charAt(j);
            while(c.contains(t)){
                c.remove(s.charAt(i));
                i++;
            }
            c.add(t);

            max = Math.max(max, c.size());
            j++;
        }

        return max;
    }
}