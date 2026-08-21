class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int start = 0;
        int curr = 1;
        while(start<nums.length){
            while(curr<nums.length){
                if(nums[start]+nums[curr]==target){
                    ans[0] = start;
                    ans[1] = curr;
                    break;
                }
                curr++;
            }
            start++;
            curr = start +1;
        }
        return ans;
    }
}