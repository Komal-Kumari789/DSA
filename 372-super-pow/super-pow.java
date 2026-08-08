class Solution {
    public int superPow(int a, int[] b) {
        int mod = 1337;
        int result = 1;

        a = a % mod;

        for (int digit : b) {
            result = (pow(result, 10) * pow(a, digit)) % mod;
        }

        return result;
    }

    private int pow(int a, int n) {
        int result = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * a) % 1337;
            }

            a = (a * a) % 1337;
            n /= 2;
        }

        return result;
    }
}