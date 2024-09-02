class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }
        boolean goingUp = true;
        int row = 0;
        String[] str = new String[numRows];
        for(int i = 0; i < s.length(); i++){

            if(str[row] != null){
                str[row] = str[row] + s.charAt(i);
            }else{
                str[row] = "" + s.charAt(i);
            }

            if(goingUp){
                row++;
            }else{
                row--;
            }

            if(row == numRows -1){
                goingUp = false;
            } else if(row == 0){
                goingUp = true;
            }

        }

        String answer = str[0];
        for(int i = 1; i < str.length; i++){
            if(str[i] != null){
                answer = answer + str[i];
            }
            
        }
        return answer;
    }
}