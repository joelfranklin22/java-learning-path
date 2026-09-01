class Sum_Two_Large_Number {
    public static void main(String args[]) {
        String s1 = "000";
        String s2 = "000";
        int digit1 = 0;
        int digit2 = 0;
        int digit = 0;
        int sum = 0;
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                digit1 = s1.charAt(i) - '0';
                i--;
            } else {
                digit1 = 0;
            }
            if (j >= 0) {
                digit2 = s2.charAt(j) - '0';
                j--;
            } else {
                digit2 = 0;
            }
            sum = digit1 + digit2 + carry;
            digit = sum % 10;
            carry = sum / 10;

            sb.append(digit);
        }
        if (carry != 0)
            sb.append(carry);

        String ans = sb.reverse().toString();
        int k = 0;
        while (k < ans.length() && ans.charAt(k) == '0') {
            k++;
        }
        if (k == ans.length())
            System.out.println(0);

        System.out.println(ans.substring(k));
    }
}
