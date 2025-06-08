class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length < 2){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> answers = new ArrayList<>();

        int[] temp = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(temp[1] >= intervals[i][0]){
                temp[1] = Math.max(temp[1],intervals[i][1]);
            }else{
                answers.add(temp);
                temp = intervals[i];
            }

            if(i == intervals.length - 1){
                answers.add(temp);
                temp = intervals[i];
            }
        }

        int[][] a = new int[answers.size()][2];
        int i = 0;
        for(int[] p : answers){
            a[i]= answers.get(i);
            i++;
        }
        return a;
    }
}