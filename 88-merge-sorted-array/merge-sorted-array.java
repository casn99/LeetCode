class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        
        int i = m + n - 1;
        int j = 0;
        int k = 0;

        m--;
        n--;

        while(m >= 0 && n >= 0){
            
            int answer = 0;
            if(nums1[m] > nums2[n]){
                answer = nums1[m];
                m--;
            }else{
                answer = nums2[n];
                n--;
            }

            nums1[i] = answer;
            i--;
        }

        while (n >= 0) {
            nums1[i--] = nums2[n--];
        }

    }
}