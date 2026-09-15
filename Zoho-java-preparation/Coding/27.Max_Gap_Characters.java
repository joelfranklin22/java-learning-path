import java.util.Arrays;

class Max_Gap_Characters {
    public static void main(String[] args) {
        String s1 = "socks";
        int temp[] = new int[26];
        int max = -1;
        Arrays.fill(temp, -1);
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            if (temp[index] == -1) {
                temp[index] = i;
            } else {

                max = Math.max(max, i - temp[index] - 1);
            }
        }
        System.out.println("Character Gap--->" + max);
    }
}
