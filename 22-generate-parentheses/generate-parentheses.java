class Solution {
    
    public void solve(List<String>l,int i, int j, int c, String s){

        if(i == c && j == c){
            l.add(s);
        }

        if(j > i || j > c || i > c){
            return;
        }

        solve(l, i+1, j, c, s +"(");
        solve(l, i, j+1, c, s +")");


    }
    public List<String> generateParenthesis(int n) {

        List<String> answer = new ArrayList<>();

        solve(answer, 0,0,n, "");

        return answer;
        
    }
} 