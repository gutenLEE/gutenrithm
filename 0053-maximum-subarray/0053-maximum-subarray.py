class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        local_max = global_max = nums[0]
        
        for n in nums[1:]: 
            tmp = local_max + n
            
            # 현재 원소 이전에 합을 더할지
            if tmp > n:
                local_max = tmp
            else:
                # 새로 시작할지 
                local_max = n
            global_max = max(global_max, local_max)
        return global_max
