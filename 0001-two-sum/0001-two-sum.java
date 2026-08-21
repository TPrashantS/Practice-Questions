//Brute Force

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];
//         int start = 0;
//         while(start<nums.length){
//             int curr = start + 1;
//             while(curr<nums.length){
//                 if(nums[start]+nums[curr]==target){
//                     ans[0] = start;
//                     ans[1] = curr;
//                     break;
//                 }
//                 curr++;
//             }
//             start++;
//         }
//         return ans;
//     }
// }

//Optimised (HashMap)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int req = target - nums[i];
            if(hm.containsKey(req)){
                return new int[]{hm.get(req), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}