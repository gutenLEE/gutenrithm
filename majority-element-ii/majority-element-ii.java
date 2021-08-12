class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        if (n == 0) return res;
        if (n == 1) 
        { 
            res.add(nums[0]); 
            return res;
        }
        
        Integer f = null;
        Integer s = null;
        int cntf = 0;
        int cnts = 0;
        for (int i = 0; i < n; i ++)
        {
            if (f == null || f == nums[i])
            {
                f = nums[i];
                cntf ++;
            }
            else if (s == null || s == nums[i])
            {
                s = nums[i];
                cnts ++;
            }
            else if (cntf == 0)
            {
                f = nums[i];
                cntf = 1;
            }
            else if (cnts == 0)
            {
                s = nums[i];
                cnts = 1;
            }
            else
            {
                cntf --;
                cnts --;
            }
        }
        
        cntf = 0; cnts = 0;
        for (int i = 0; i < n; i ++)
        {
            if (f != null && nums[i] == f) cntf ++;
            if (s != null && nums[i] == s) cnts ++;
        }
        
        if (cntf > n/3) res.add(f);
        if (cnts > n/3) res.add(s);
        
        return res;
    }
}