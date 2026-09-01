class Remaning_String {
    public static void main(String[] args) {
        String str = "Thisisdemostring";
        char ch = 'i';
        int count = 3;
        String remaining = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                --count;
            }
            if (count == 0) {
                remaining = str.substring(i + 1);
                break;
            }
        }
        System.out.print("Letters After End---->" + remaining);
    }
}
