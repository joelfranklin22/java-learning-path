class Minimum_Moves_Convert_String {
    public int minimumMoves(String s) {

        int count = 0;
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}