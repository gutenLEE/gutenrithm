class Solution:
    def romanToInt(self, s: str) -> int:
        map = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        
        length = len(list(s))
        sum = 0
        for i in range(0, length - 1):
            next = i + 1
            if map[s[i]] >= map[s[next]]:
                sum += map[s[i]]
            else:
                sum -= map[s[i]]
        
        return sum + map[s[-1]]

