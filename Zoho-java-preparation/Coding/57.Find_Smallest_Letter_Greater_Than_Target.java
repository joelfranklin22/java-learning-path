class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters = { 'x', 'x', 'y', 'y' };
        char target = 'z';
        System.out.println(Greater_Element(letters, target));

    }

    static char Greater_Element(char letters[], int target) {
        int start = 0;
        int end = letters.length - 1;
        char answer = letters[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                answer = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }
}
