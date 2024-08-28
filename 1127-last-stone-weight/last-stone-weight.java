class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> rocks = new PriorityQueue<>(Collections.reverseOrder());

        int bigRock;
        int lilRock;

        for(int i = 0; i < stones.length; i++){

            rocks.offer(stones[i]);

        }

        while(rocks.size() > 1){
                bigRock = rocks.poll();
                lilRock = rocks.poll();

                if(bigRock > lilRock){
                    rocks.offer(bigRock - lilRock);
                }
        }

        rocks.offer(0);
        return rocks.poll();
    }
}

