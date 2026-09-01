class Add_Digits {
    public static void main(String[] args) {
        int digit = 38;

        System.out.println(single_digit(digit));
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