class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] w1 = s1.split(" ", 200);
        String[] w2 = s2.split(" ", 200);

        HashMap<String, Integer> words = new HashMap<>();

        for(int i = 0; i < w1.length; i++){
            words.put(w1[i], words.getOrDefault(w1[i], 0) + 1);
        }
        for(int i = 0; i < w2.length; i++){
            words.put(w2[i], words.getOrDefault(w2[i], 0) + 1);
        }


        List<String> ans = new LinkedList();
	    for (String word: words.keySet()) {
		    if (words.get(word) == 1) {
	    		ans.add(word);
	    	}
	    }

	    return ans.toArray(new String[ans.size()]);
    }
}