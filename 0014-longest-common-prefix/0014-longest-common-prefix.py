class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        
        L = len(strs)
        prefix = strs[0]
        
        for s in strs[1:]:
            i, j = 0, 0
            P, S = len(prefix), len(s)
            while i < P and j < S:
                if prefix[i] == s[j]:
                    i += 1
                    j += 1
                else:
                    break
            prefix = prefix[:i]

        return prefix
            