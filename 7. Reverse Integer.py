class Solution:
    def reverse(self, x: int) -> int:
        negative = x < 0
        x = abs(x)

        reverse_num = 0

        while x > 0:
            digit = x % 10
            reverse_num = reverse_num * 10 + digit
            x //= 10

        if negative:
            reverse_num = -reverse_num

        if reverse_num < -2**31 or reverse_num > 2**31 - 1:
            return 0

        return reverse_num
