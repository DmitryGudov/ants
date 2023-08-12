public class Main {
    public static void main(String[] args) {
        RoundsServiceFirst serviceFirst = new RoundsServiceFirst();
        RoundsServiceSecond serviceSecond = new RoundsServiceSecond();

        System.out.println("Case 1:");
        System.out.println(serviceFirst.calculateRoundsFirst(5, 0, 5) + " = " + serviceSecond.calculateRoundsSecond(5, 0, 5));
        System.out.println(serviceFirst.calculateRoundsFirst(8, 0, 8) + " = " + serviceSecond.calculateRoundsSecond(8, 0, 8));

        System.out.println("Case 2:");
        System.out.println(serviceFirst.calculateRoundsFirst(5, 0, 3) + " = " + serviceSecond.calculateRoundsSecond(5, 0, 3));
        System.out.println(serviceFirst.calculateRoundsFirst(7, 0, 2) + " = " + serviceSecond.calculateRoundsSecond(7, 0, 2));

        System.out.println("Case 3:");
        System.out.println(serviceFirst.calculateRoundsFirst(10, 4, 10) + " = " + serviceSecond.calculateRoundsSecond(10, 4, 10));
        System.out.println(serviceFirst.calculateRoundsFirst(14, 3, 14) + " = " + serviceSecond.calculateRoundsSecond(14, 3, 14));

        System.out.println("Case 4.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(20, 20, 0) + " = " + serviceSecond.calculateRoundsSecond(20, 20, 0));
        System.out.println(serviceFirst.calculateRoundsFirst(8, 8, 0) + " = " + serviceSecond.calculateRoundsSecond(8, 8, 0));

        System.out.println("Case 4.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(35, 35, 0) + " = " + serviceSecond.calculateRoundsSecond(35, 35, 0));
        System.out.println(serviceFirst.calculateRoundsFirst(11, 11, 0) + " = " + serviceSecond.calculateRoundsSecond(11, 11, 0));

        System.out.println("Case 5.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(15, 12, 0) + " = " + serviceSecond.calculateRoundsSecond(15, 12, 0));
        System.out.println(serviceFirst.calculateRoundsFirst(5, 4, 0) + " = " + serviceSecond.calculateRoundsSecond(5, 4, 0));

        System.out.println("Case 5.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(12, 7, 0) + " = " + serviceSecond.calculateRoundsSecond(12, 7, 0));
        System.out.println(serviceFirst.calculateRoundsFirst(28, 23, 0) + " = " + serviceSecond.calculateRoundsSecond(28, 23, 0));

        System.out.println("Case 6.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(3, 3, 1) + " = " + serviceSecond.calculateRoundsSecond(3, 3, 1));
        System.out.println(serviceFirst.calculateRoundsFirst(7, 7, 1) + " = " + serviceSecond.calculateRoundsSecond(7, 7, 1));

        System.out.println("Case 6.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(41, 41, 4) + " = " + serviceSecond.calculateRoundsSecond(41, 41, 4));
        System.out.println(serviceFirst.calculateRoundsFirst(6, 6, 3) + " = " + serviceSecond.calculateRoundsSecond(6, 6, 3));

        System.out.println("Case 7.1.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(16, 10, 6) + " = " + serviceSecond.calculateRoundsSecond(16, 10, 6));
        System.out.println(serviceFirst.calculateRoundsFirst(28, 16, 12) + " = " + serviceSecond.calculateRoundsSecond(28, 16, 12));

        System.out.println("Case 7.1.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(25, 20, 5) + " = " + serviceSecond.calculateRoundsSecond(25, 20, 5));
        System.out.println(serviceFirst.calculateRoundsFirst(39, 28, 1) + " = " + serviceSecond.calculateRoundsSecond(39, 28, 11));

        System.out.println("Case 7.2.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(16, 10, 8) + " = " + serviceSecond.calculateRoundsSecond(16, 10, 8));
        System.out.println(serviceFirst.calculateRoundsFirst(30, 20, 12) + " = " + serviceSecond.calculateRoundsSecond(30, 20, 12));

        System.out.println("Case 7.2.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(20, 13, 8) + " = " + serviceSecond.calculateRoundsSecond(20, 13, 8));
        System.out.println(serviceFirst.calculateRoundsFirst(37, 25, 14) + " = " + serviceSecond.calculateRoundsSecond(37, 25, 14));

        System.out.println("Case 7.3.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(20, 13, 5) + " = " + serviceSecond.calculateRoundsSecond(20, 13, 5));
        System.out.println(serviceFirst.calculateRoundsFirst(37, 29, 3) + " = " + serviceSecond.calculateRoundsSecond(37, 29, 3));

        System.out.println("Case 7.3.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(18, 7, 4) + " = " + serviceSecond.calculateRoundsSecond(18, 7, 4));
        System.out.println(serviceFirst.calculateRoundsFirst(43, 18, 13) + " = " + serviceSecond.calculateRoundsSecond(43, 18, 13));

        System.out.println("Case 8.1.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(46, 6, 40) + " = " + serviceSecond.calculateRoundsSecond(46, 6, 40));
        System.out.println(serviceFirst.calculateRoundsFirst(22, 10, 12) + " = " + serviceSecond.calculateRoundsSecond(22, 10, 12));

        System.out.println("Case 8.1.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(63, 9, 54) + " = " + serviceSecond.calculateRoundsSecond(63, 9, 54));
        System.out.println(serviceFirst.calculateRoundsFirst(11, 2, 9) + " = " + serviceSecond.calculateRoundsSecond(11, 2, 9));

        System.out.println("Case 8.2.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(46, 6, 42) + " = " + serviceSecond.calculateRoundsSecond(46, 6, 42));
        System.out.println(serviceFirst.calculateRoundsFirst(22, 10, 14) + " = " + serviceSecond.calculateRoundsSecond(22, 10, 14));

        System.out.println("Case 8.2.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(24, 9, 18) + " = " + serviceSecond.calculateRoundsSecond(24, 9, 18));
        System.out.println(serviceFirst.calculateRoundsFirst(53, 20, 37) + " = " + serviceSecond.calculateRoundsSecond(53, 20, 37));

        System.out.println("Case 8.3.1:");
        System.out.println(serviceFirst.calculateRoundsFirst(46, 6, 36) + " = " + serviceSecond.calculateRoundsSecond(46, 6, 36));
        System.out.println(serviceFirst.calculateRoundsFirst(22, 8, 10) + " = " + serviceSecond.calculateRoundsSecond(22, 8, 10));

        System.out.println("Case 8.3.2:");
        System.out.println(serviceFirst.calculateRoundsFirst(24, 9, 14) + " = " + serviceSecond.calculateRoundsSecond(24, 9, 14));
        System.out.println(serviceFirst.calculateRoundsFirst(53, 20, 31) + " = " + serviceSecond.calculateRoundsSecond(53, 20, 31));
    }
}