class Reverse_Word {
    public static void main(String[] args) {
        String s = "Hello World";
        s = s.trim();
        String[] words = s.split("\\s+");

        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);

            if (i != 0)
                ans.append(" ");
        }

        System.out.println("Reverse Word is -->" + ans);
    }
}
