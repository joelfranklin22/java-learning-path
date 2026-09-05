class Last_Digit_ab {
    public static void main(String[] args) {
        String a = "3";
        String b = "10";
        System.out.println(getLastDigit(a, b));
    }

    static int getLastDigit(String a, String b) {

        if (a.equals("0"))
            return 0;
        if (b.equals("0"))
            return 1;

        int base = a.charAt(a.length() - 1) - '0';

        int exponent = 0;
        if (b.length() > 2)
            exponent = Integer.parseInt(b.substring(b.length() - 2)) % 4;
        else
            exponent = Integer.parseInt(b) % 4;

        if (exponent == 0)
            exponent = 4;

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % 10;
        }
        return result;
    }
}
