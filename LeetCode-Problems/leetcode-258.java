// Add Digits

class Solution {
    public int addDigits(int num) {
        return single_digit(num);
    }

    static int single_digit(int digit) {
        if (digit < 10) {
            return digit;
        }

        int sum = 0;

        while (digit != 0) {
            sum += digit % 10;
            digit /= 10;
        }

        return single_digit(sum);
    }
}   