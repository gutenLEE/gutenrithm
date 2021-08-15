class Solution {
    public int removeDuplicates(int[] nums) {
        
        // at most twice
        int pointer = 0;
        int res = 0;
        int duplicate = 0;
        int len = nums.length;
        
        for(int i = 0; i < len; i++){
            if(res >= 2 && nums[i] == nums[res -1] && nums[i] == nums[res - 2]){
                duplicate++;
                continue;
            }
            nums[res] = nums[i];
            res++;
        }
        return len - duplicate;
    }
}

