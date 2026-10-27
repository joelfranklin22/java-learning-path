
import java.util.Arrays;

class Corporate_Flight_Bookings {

    public static void main(String[] args) {

        int bookings[][] = {{1, 3, 10}, {2, 3, 20}, {2, 5, 20}};
        int n = 5;

        System.out.println(Arrays.toString(corpFlightBookings(bookings, n)));
    }

    static int[] corpFlightBookings(int[][] bookings, int n) {
        int diff[] = new int[n + 1];
        int seats[] = new int[n];

        for (int[] booking : bookings) {

            int start = booking[0] - 1;
            int end = booking[1] - 1;
            int value = booking[2];

            diff[start] += value;
            diff[end + 1] -= value;
        }

        seats[0] = diff[0];
        
        for (int i = 1; i < n; i++) {
            seats[i] = seats[i - 1] + diff[i];
        }
        return seats;
    }
}
