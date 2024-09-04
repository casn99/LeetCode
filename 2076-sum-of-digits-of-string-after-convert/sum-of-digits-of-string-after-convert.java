class Solution {
    public int getLucky(String s, int k) {
        //runs very slow because java data types are immutable
        String runner = "";
        int temp = 0;
        for(int j = 0; j < s.length(); j++){
                runner = runner + Integer.toString( 1 + s.charAt(j) - 'a');
            }
        for(int i = 0; i < k; i++){         
            for(int p =0; p < runner.length(); p++){
                temp += runner.charAt(p) - '0';
            }

            s = Integer.toString(temp);
            System.out.println(s);
            runner = Integer.toString(temp);
            temp =0;
            System.gc();//funny
        }
        
        return Integer.valueOf(s);
    }
}