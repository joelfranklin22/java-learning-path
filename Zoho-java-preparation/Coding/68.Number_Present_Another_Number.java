class Number_Present_Another_Number {
    public static void main(String args[]) {
        int a = 10;
        int b = -10;
        System.out.println(numberPresent(a, b));
    }

    static boolean numberPresent(int a, int b) {

        if (String.valueOf(b).contains(String.valueOf(a)))
            return true;
        return false;
    }
}
