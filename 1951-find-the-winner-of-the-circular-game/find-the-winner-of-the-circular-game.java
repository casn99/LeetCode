class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer>  numbers = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            numbers.add(i);
        }

        int current = k;
        while(numbers.size() > 1){

            for(int i = 0; i< k - 1; i++){
                numbers.add(numbers.remove());
            }

            numbers.remove();


            current += k;
        }
        return numbers.remove();
    }
}