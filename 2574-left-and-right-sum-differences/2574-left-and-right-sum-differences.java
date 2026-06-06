class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        //exclusive prefix sum
        int[] prefix = new int[nums.length];
        prefix[0] = 0;
        for(int i = 1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        //exclusive suffix sum
        int[] suffix = new int [nums.length];
        suffix[nums.length-1] = 0;
        for(int j = nums.length-2; j>=0;j--){
            suffix[j] = suffix[j+1] + nums[j+1];
        }
        //answer
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = Math.abs(prefix[i]-suffix[i]);
        }
        return ans;
    }
}