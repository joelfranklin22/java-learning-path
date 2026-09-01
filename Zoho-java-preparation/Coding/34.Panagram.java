class Panagram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        int temp[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            temp[index] = 1;
        }
        boolean matched = false;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                System.out.print("not matched");
                matched = true;
                break;
            }
        }
        if (matched == false)
            System.out.println("matched");
    }
}
