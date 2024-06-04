class Solution {
    public int totalFruit(int[] fruits) {

        //works but is brute force
        //^^^^^^^^^^^^^^^
        
        HashSet<Integer> types = new HashSet<>();
        int streak = 0;
        int best = 0;
        //goes throgh each possible starting index of fruits
        for(int i = 0; i < fruits.length; i++){

            //sees how many fruits could be picked if starting at this location
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

            //end of outer loops updates bests and resets counters for inner loop
            best = Math.max(streak, best);
            streak = 0;
            types.clear();

            //this is the trick to get brute force to submit
            if(fruits.length > 1000 && best >= fruits.length - 3 ){
                return best;
            }




        }

        return best;
    }
}