
class ConvertToBase7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
    }

    static String convertToBase7(int num) {

        int temp = num;
        if (num == 0)
            return "0";

        if (num < 0)
            temp = Math.abs(num);

        StringBuilder base = new StringBuilder();
        while (temp != 0) {
            int remainder = temp % 7;
            base.append(remainder);
            temp = temp / 7;
        }
        String ans = base.reverse().toString();
        if (num < 0)
            return "-" + new String(ans);
        else
            return new String(ans);
    }

}