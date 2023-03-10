/**
 * @Author Foy Lian
 * @Date 2023/3/10 15:57
 **/
public class Fib2 {
    public static void main(String[] args) {
        int n = 100;

        long[] fib = new long[n + 1];

        fib[1] = 1;
        fib[2] = 2;

        for (int i = 3; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("result:" + fib[n]);

    }
}
