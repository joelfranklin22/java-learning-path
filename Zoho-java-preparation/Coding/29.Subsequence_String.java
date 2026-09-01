class Subsequence_String {
    public static void main(String[] args) {
        String s1 = "AXY";
        String s2 = "YDAXCP";
        int len1 = s1.length();
        int len2 = s2.length();
        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            if (s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }
        if (i == len1)
            System.out.print(true);
        else
            System.out.print(false);
    }
}
