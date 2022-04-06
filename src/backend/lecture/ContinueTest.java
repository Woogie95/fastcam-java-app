package backend.lecture;

public class ContinueTest {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 1; i <= 100; i++) {
            num = i;
            if (num % 3 != 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
