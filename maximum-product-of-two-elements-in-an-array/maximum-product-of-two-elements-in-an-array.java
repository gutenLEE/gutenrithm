class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        
        int answer = (nums[len - 1] - 1) * (nums[len - 2] - 1);
        return answer;
    }
}