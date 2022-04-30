class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            int a1 = nums[i];
            for(int j = i+1; j < nums.length; j++){
                int a2 = nums[j];
                if(a1+a2 == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}