class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        # iterate over array
        # append each letter

        min_length = min(len(word1), len(word2))

        answer = ''
        for i in range(0, min_length):
            answer += word1[i]
            answer += word2[i]
        
        if len(word1) > len(word2):
            answer += word1[min_length:]
        else:
            answer += word2[min_length:]
        
        return answer

        
"""
위 풀이 방식은 문자열에 새로운 문자를 append할 때마다 문자 복사 비용이 발생한다.
"""
