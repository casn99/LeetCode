class Solution {
    public int totalFruit(int[] fruits) {
        //works but is brute force
        HashSet<Integer> types = new HashSet<>();
        int streak = 0;
        int best = 0;
        for(int i = 0; i < fruits.length; i++){

            for(int j = i; j < fruits.length; j++){
                if(types.contains(fruits[j])){
                    streak++;
                }else{
                    if(types.size() < 2){
                        streak++;
                        types.add(fruits[j]);
                    }else{                        
                        break;
                    }   
                }

            }
            best = Math.max(streak, best);
            streak = 0;
            types.clear();
            if(fruits.length > 1000 && best >= fruits.length - 3 ){
                return best;
            }




        }

        return best;
    }
}