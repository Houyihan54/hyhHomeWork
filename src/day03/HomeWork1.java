package day03;

public class HomeWork1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int m = 2; m <= 100; m++) {
            int x = 0;
            for (int n = 2; n < m; n++) {
                if (m % n == 0) {
                    x++;
                }
            }
            if (x == 0) {
                sum += m;
            }
        }
        System.out.print(sum);
    }
}
