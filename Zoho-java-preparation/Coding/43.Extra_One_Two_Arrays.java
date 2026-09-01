class Extra_One_Two_Arrays {
    public static void main(String args[]) {
        int a[] = { 3, 5, 7, 8, 11, 13 };
        int b[] = { 3, 5, 7, 11, 13 };
        int i = 0;
        int j = 0;
        int extra = 0;
        while (i < a.length && i < b.length) {
            if (a[i] != b[j]) {
                extra = i;
                break;
            }
            i++;
            j++;
        }
        if (i == a.length - 1)
            System.out.println(i);
        System.out.println(extra);
    }
}
