import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pos = m;
        
        for (int j : nums2) {
            nums1[pos] = j;
            pos++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}