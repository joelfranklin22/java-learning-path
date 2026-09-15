class Remove_Digit_Number_Maximize_Result {
    public static void main(String[] args) {
        String number = "1231";
        char digit = '1';
        System.out.println(Max_Digit(number, digit));
    }

    static String Max_Digit(String number, char digit) {
        int n = number.length();
        for (int i = 0; i < n; i++) {
            char value = number.charAt(i);
            if (value == digit) {
                if (i + 1 < n && number.charAt(i + 1) > digit) {
                    return number.substring(0, i) + number.substring(i + 1);
                }
            }
        }
        int last = number.lastIndexOf(digit);
        return number.substring(0, last) + number.substring(last + 1);
    }
}