class Sum_Square_Numbers {
    public static void main(String[] args) {
        int c = -5;
        c = Math.abs(c);
        System.out.print(squareNumber(c));
    }

    static boolean squareNumber(int c) {

        long i = 0;
        long j = (long) Math.sqrt(c);
        long sum = 0;
        while (i <= j) {
            sum = i * i + j * j;
            if (sum == c)
                return true;
            else if (sum < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
