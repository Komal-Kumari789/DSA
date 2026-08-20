class Solution:
    def multiply(self, num1, num2):

        if num1 == "0" or num2 == "0":
            return "0"

        result = [0] * (len(num1) + len(num2))

        for i in range(len(num1) - 1, -1, -1):
            for j in range(len(num2) - 1, -1, -1):

                p = i + j + 1

                result[p] += int(num1[i]) * int(num2[j])

                result[p - 1] += result[p] // 10
                result[p] %= 10

        ans = ""

        for x in result:
            ans += str(x)

        return ans.lstrip("0")