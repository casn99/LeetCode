class Solution {
    public String reorganizeString(String s) {
        if(s.length() <= 1){
            return s;
        }
        if(s.length() == 2){
            return s.charAt(0) != s.charAt(1) ? s : "";
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