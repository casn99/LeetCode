class LRUCache {

    LinkedList<Integer> l;
    HashMap<Integer, Integer> m;
    int max;
    public LRUCache(int capacity) {
        l  = new LinkedList<>();
        m = new HashMap<>();
        max = capacity;
    }

    
    public int get(int key) {
        if(m.containsKey(key)){
            l.remove((Integer) key);
            l.addFirst(key);
            return m.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (m.containsKey(key)) {
            l.remove((Integer) key);
        }
        l.addFirst(key);
        m.put(key, value);

        if (l.size() > max) {
            int lruKey = l.removeLast();
            m.remove(lruKey);
        }

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */