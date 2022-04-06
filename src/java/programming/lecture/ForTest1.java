package java.programming.lecture;

public class ForTest1 {
    public static void main(String[] args) {
        int sum = 0;
        int oddCount = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                oddCount++;
            }
        }
        System.out.println("1 ~ 10까지 홀수의 개수 : " + oddCount);
        System.out.println("1 ~ 10까지 홀수의 총 합 : " + sum);
    }
}
