class Words_From_Phone_Digits {
    public static void main(String args[]) {
        String arr[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        int num = 23;
        int first = num / 10;
        int second = num % 10;
        String first_digit = arr[first - 2];
        String second_digit = arr[second - 2];

        for (int i = 0; i < first_digit.length(); i++) {
            for (int j = 0; j < second_digit.length(); j++) {
                System.out.println(first_digit.charAt(i) + "" + second_digit.charAt(j));
            }
        }
    }
}
