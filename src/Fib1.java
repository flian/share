/**
 * @Author Foy Lian
 * @Date 2023/3/10 15:45
 **/
public class Fib1 {
    /**
     * 小兔子喜欢蹦蹦跳跳上楼梯 ，它能一次跳1阶楼梯，也能一次跳上2阶楼梯。问小兔子要上一个n阶的楼梯，最多有多少种不同上楼的走法？
     */

    public static void main(String[] args) {
        int n = 100;
        System.out.println("result:" + fib(n));
    }

    public static long fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
