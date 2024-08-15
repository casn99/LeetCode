class Solution:
    def intToRoman(self, num: int) -> str:
        temp = num
        i = 0
        rom = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV", "I"]
        numbers = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        romanAnswer = ""

        while temp > 0:
            if temp >= numbers[i]:
                romanAnswer = romanAnswer + rom[i]
                temp = temp - numbers[i]
            else:
                i += 1

            if temp == 0:
                break

        return romanAnswer
