class Remove_Stars_String {
    public static void main(String[] args) {
        String s = "erase*****";
        System.out.print(Remove_Stars(s));
    }

    static String Remove_Stars(String s) {
        char[] arr = s.toCharArray();

        int str = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '*')
                str--;
            else
                arr[str++] = arr[i];
        }
        return new String(arr, 0, str);
    }
}