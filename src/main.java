import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        solve(20);
    }


    public static int[] solve(int n) {
        n = n + 1;
        int[] num = new int[n];
        int[] prime;
        int size = 0;
        for (int i = 2; i < num.length; i++) {
            if (num[i] == 0) {
                size++;
                int loopEnd = (n / i);
                System.out.println(loopEnd);
                for (int mult = 2; mult < loopEnd; mult++) {
                    int res = i * mult;
                    if (res < n) {
                        num[res] = 1;
                    }
                }
            }
        }
        prime = new int[size];
        int index = 0;
        for (int i = 2; i < n; i++) {
            if (num[i] == 0) {
                prime[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(prime));
        return prime;
    }
}
