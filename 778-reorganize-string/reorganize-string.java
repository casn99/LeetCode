/*

public String reorganizeString(String s) {

        char[] p = s.toCharArray();

        if(p.length <= 1){
            return s;
        }
        if(p.length == 2 && p[0] != p[1]){
            return s;
        }

        int first = 0;
        int runner = 1;

        for(int i = 0; i < s.length() - 1; i++){
            first = i;
            runner = i +1;
            while(runner < p.length && p[first] == p[runner]){
                runner++;
            }
            if(runner < p.length){
                char temp = p[first + 1];
                p[first + 1] = p[runner];
                p[runner] = temp;
            }else{
               return ""; 
            }
        }


        return String.valueOf(p);

        
    }

*/





class Solution {
    public String reorganizeString(String s) {
        if(s.length() <= 1){
            return s;
        }
        if(s.length() == 2 && s.charAt(0) != s.charAt(1)){
            return s;
        }

        char[] answer = new char[s.length()];

        HashMap<Character, Integer> chars = new HashMap<>();

        for(char c : s.toCharArray()){
            chars.put(c, chars.getOrDefault(c,0) +1);
        }

        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> chars.get(b) - chars.get(a));

        for(char c : chars.keySet()){
            heap.offer(c);
        }

        for(int i = 0; i < answer.length; i++){

            if(heap.size() == 0){
                return "";
            }

            char c =  heap.poll();

            if(i > 0 && answer[i - 1] == c){
                char temp = c;
                if(heap.size() > 0){
                    c = heap.poll();
                    chars.put(temp, chars.get(temp));
                    heap.offer(temp);
                }else{
                    return "";
                }
                

            }

            chars.put(c, chars.get(c) -1);
            if(chars.get(c) > 0){
                heap.offer(c);
            }
            
            answer[i] = c;
        }

        return String.valueOf(answer);
        
    }
}