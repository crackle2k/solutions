class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        count = 0
        for character in word:
            if character.isupper():
                count += 1
        
        if len(word) == count:
            return True
        elif count == 0:
            return True
        elif count == 1 and word[0].isupper():
            return True
        else:
            return False
