class Even_Odd {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(evenodd(n));
    }

    static String evenodd(int n) {
        if ((n & 1) == 0)
            return "even";
        return "odd";
    }
}