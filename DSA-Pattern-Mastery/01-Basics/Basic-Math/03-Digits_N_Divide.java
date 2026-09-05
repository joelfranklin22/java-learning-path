class Digits_N_Divide {
    public static void main(String args[]){
        String s="1122324";
        System.out.println(divisibleByDigits(s));
    }
    static int divisibleByDigits(String s) {
        int remainder[] = new int[10];  
        for (int i = 0; i < s.length(); i++) {
            int currDigit = s.charAt(i) - '0';
            for (int j = 1; j <= 9; j++) {
                remainder[j] = (remainder[j] * 10 + currDigit) % j;  
            }
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit > 0 && remainder[digit] == 0) {
                count++;
            }
        }
        return count;
}
}