public class RoundsServiceFirst {
    public int calculateRoundsFirst(int n, int left, int right) {
        int rounds = 0;

        // Cases 1-3:
        if ((left == 0) || (right == n)) {
            rounds = 1;
        }

        // Case 4.1:
        if ((right == 0) & (left == n) & ((left - right) % 2 == 0)) {
            rounds = n - 1;
        }

        // Case 4.2:
        if ((right == 0) & (left == n) & ((left - right) % 2 != 0)) {
            rounds = n;
        }

        // Case 5.1:
        if ((right == 0) & ((n - left) > right) & ((left - right) % 2 == 0)) {
            rounds = left - 1;
        }

        // Case 5.2:
        if ((right == 0) & ((n - left) > right) & ((left - right) % 2 != 0)) {
            rounds = left;
        }

        // Case 6.1:
        if ((right > 0) & (right < n) & (left == n) & ((left - right) % 2 == 0)) {
            rounds = n - right;
        }

        // Case 6.2:
        if ((right > 0) & (right < n) & (left == n) & ((left - right) % 2 != 0)) {
            rounds = n - right;
        }

        // Case 7.1.1:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left > right) & (right == (n - left)) & ((left - right) % 2 == 0)) {
            rounds = left - 1;
        }

        // Case 7.1.2:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left > right) & (right == (n - left)) & ((left - right) % 2 != 0)) {
            rounds = left;
        }

        // Case 7.2.1:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left > right) & (right > (n - left)) & ((left - right) % 2 == 0)) {
            rounds = left - 1;
        }

        // Case 7.2.2:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left > right) & (right > (n - left)) & ((left - right) % 2 != 0)) {
            rounds = n - right;
        }

        // Case 7.3.1:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left > right) & (right < (n - left)) & ((left - right) % 2 == 0)) {
            rounds = left - 1;
        }

        // Case 7.3.2:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left > right) & (right < (n - left)) & ((left - right) % 2 != 0)) {
            rounds = left;
        }

        // Case 8.1.1:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left < right) & (left == (n - right)) & ((right - left) % 2 == 0)) {
            rounds = left + 1;
        }

        // Case 8.1.2:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left < right) & (left == (n - right)) & ((right - left) % 2 != 0)) {
            rounds = left + 1;
        }

        // Case 8.2.1:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left < right) & (left > (n - right)) & ((right - left) % 2 == 0)) {
            rounds = n - right + 1;
        }

        // Case 8.2.2:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left < right) & (left > (n - right)) & ((right - left) % 2 != 0)) {
            rounds = n - right + 1;
        }

        // Case 8.3.1:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left < right) & (left < (n - right)) & ((right - left) % 2 == 0)) {
            rounds = left + 1;
        }

        // Case 8.3.2:
        if ((right > 0) & (right < n) & (left > 0) & (left < n) & (left < right) & (left < (n - right)) & ((right - left) % 2 != 0)) {
            rounds = left + 1;
        }

        return rounds;
    }
}