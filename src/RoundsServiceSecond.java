public class RoundsServiceSecond {
    public static int calculateRoundsSecond(int n, int left, int right) {
        int rounds = 0;

        while (left >= 0 && left <= n && right >= 0 && right <= n) {
            if (left - right == 1) {
                if (left == n || right == 0) {
                    rounds++;
                    break;
                }
                left -= 2;
                right += 2;
                rounds++;
            }
            if (left - right == 2) {
                left -= 3;
                right++;
                rounds++;
            }
            left--;
            right++;
            rounds++;
        }

        return rounds;
    }
}