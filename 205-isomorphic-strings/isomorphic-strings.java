class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] sM = new int[256];
        int[] tM = new int[256];

        for(int i = 0; i < s.length(); i++){
            if(sM[s.charAt(i)] != tM[t.charAt(i)]){
                return false;
            }else{
                sM[s.charAt(i)] = i + 1;
                tM[t.charAt(i)] = i + 1;
            }


        }
        return true;

        
    }
}