class Solution {
    public int removeDuplicates(int[] nums) {
        
        // remove duplicated elements 
        int len = nums.length;
        int i = 0;
        for(int j = 1; j < len; j++){
            if(nums[j] != nums[i]){ // when duplicated elements find, delete and move
                i++;
                nums[i] = nums[j];
            }
            
        }
        return i + 1;
    }
}