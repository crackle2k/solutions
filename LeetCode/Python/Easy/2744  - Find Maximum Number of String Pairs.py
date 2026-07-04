class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        pairs = 0
        for i in range(len(words)):
            for j in range(len(words)):
                reversedString = words[j][::-1]
                if words[i] == reversedString and i != j:
                    pairs += 1
                    
        return int(pairs / 2)
