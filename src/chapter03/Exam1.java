package chapter03;

public class Exam1 {
    public static void main(String[] args) {
        // num 변수에 할당된 숫자가 짝수인지 홀수인지를 출력하는 프로그램
        int num = 26;

        if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다.");
        } else {
            System.out.println(num + "은 홀수입니다.");
        }
    }
}
