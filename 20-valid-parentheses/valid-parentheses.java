class Solution {
    public boolean isValid(String s) {
        Stack<Character> junk = new Stack<>();
        HashSet<Character> open = new HashSet<>();

        open.add('{');
        open.add('(');
        open.add('[');
        for(int i = 0; i < s.length(); i++){
            if(open.contains(s.charAt(i))){
                junk.push(s.charAt(i));
            }else if(!junk.isEmpty()){
                if(s.charAt(i) == '}'){
                    if(junk.peek() == '{'){
                        junk.pop();
                    }else{
                        return false;
                    }
                }
                if(s.charAt(i) == ')'){
                    if(junk.peek() == '('){
                        junk.pop();
                    }else{
                        return false;
                    }
                }
                if(s.charAt(i) == ']'){
                    if(junk.peek() == '['){
                        junk.pop();
                    }else{
                        return false;
                    }
                }
            }else{
                return false;
            }

        }
    if(junk.isEmpty()){
        return true;
    }else{
        return false;
    }
    
    }
}