class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int idx = 0;
        int idx2 = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int subTarget = target - nums[i];
            for(int j = 0; j < len; j++){
               if(i == j) continue;
               if(subTarget == nums[j]){
                   idx = i;
                   idx2 = j;
                   break;
               } 
            }
        }
        return new int[]{idx, idx2};
    }
}