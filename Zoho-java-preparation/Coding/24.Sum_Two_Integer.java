class Sum_Two_Integer {
    public static void main(String[] args) {
        int a = 553;
        int b = 244;
        while (b != 0) {
            int carry = (a & b) << 1;
            a ^= b;
            b = carry;
        }
        System.out.print(a);
    }
}
