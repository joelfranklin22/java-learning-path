class Date_Between_TwoDates {
    public static void main(String args[]) {
        int d1 = 22, d2 = 14;
        int m1 = 1, m2 = 4;
        int y1 = 2004, y2 = 2004;
        int ans1 = countDays(d1, m1, y1);
        int ans2 = countDays(d2, m2, y2);
        System.out.println(Math.abs(ans1 - ans2));
    }

    static int countDays(int day, int month, int year) {
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int days = year * 365;
        days += (year - 1) / 4;
        days -= (year - 1) / 100;
        days += (year - 1) / 400;
        for (int i = 0; i < month - 1; i++)
            days += monthDays[i];
        if (isLeap(year) && month > 2)
            days++;
        days += day;
        return days;
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
