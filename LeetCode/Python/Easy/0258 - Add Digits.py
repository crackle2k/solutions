class Solution:
    def addDigits(self, num: int) -> int:
        singleDigit = False
        while singleDigit == False:
            if len(str(num)) == 1:
                return num
            else:
                new = 0
                for character in str(num):
                    new += int(character)
                num = new
