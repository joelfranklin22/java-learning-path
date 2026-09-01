import java.util.HashSet;
import java.util.Set;

 class Strength_Password {
    public static void main(String[] args) {
        String password = "bbB11#";
        int strength = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (set.contains(ch)) {
                continue;
            }
            set.add(ch);
            if (ch >= 'a' && ch <= 'z') {
                strength += 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                strength += 2;
            } else if (ch >= '0' && ch <= '9') {
                strength += 3;
            } else {
                strength += 5;
            }
        }
        System.out.println(strength);
    }
}
