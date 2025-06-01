class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //hashmap of alphabetized letters, if already exists gorup with
        List<List<String>> groups = new LinkedList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] word = s.toCharArray();
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String st = String.valueOf(sorted);
            List<String> temp = map.getOrDefault(st, new LinkedList<String>());
            temp.add(String.valueOf(word));
            map.put(st, temp);
        }
        for(List<String> l : map.values()){
            groups.add(l);
        }

        System.gc();
        return groups;
    }
}