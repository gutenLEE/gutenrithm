class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        # buy min, sell max
        
        L = len(prices)
        profit = 0
        for i in range(L - 1):
            buy = prices[i]
            sell = max(prices[i+1:])
            if profit < sell - buy:
                profit = sell - buy

        return profit
