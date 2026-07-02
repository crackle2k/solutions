class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        row1 = ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p']
        row2 = ['a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l']
        row3 = ['z', 'x', 'c', 'v', 'b', 'v', 'm']
        clean = []

        for word in words:

            count1, count2, count3 = 0, 0, 0

            for character in word.lower():
                if character in row1:
                    count1 += 1
                elif character in row2:
                    count2 += 1
                elif character in row3:
                    count3 += 1

            if (count1 == 0 and count2 == 0) or (count2 == 0 and count3 == 0) or (count3 == 0 and count1 == 0):
                clean.append(word)

        return clean
        
