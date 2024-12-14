import sys

class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        
        closest = sys.maxsize
        
        for n in nums:
            if abs(n) < abs(closest):
                closest = n
                continue
            if abs(n) == abs(closest):
                closest = max(n, closest)
        
        return closest