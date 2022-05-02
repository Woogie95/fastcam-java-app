package fastcampus.algorithmlectuer;

public class Ch08 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(sum1(n));

    }

    public static int sum(int n) {
        // O(n) 표기법
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static int sum1(int n) {
        // O(1) 표기법 위에 코드랑 값 동일
        return n * (n + 1) / 2;
    }
}
