class Reverse_Degree_String {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
    }

    static int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = ('z' - s.charAt(i)) + 1;
            sum += ch * (i + 1);
        }
        return sum;
    }
}