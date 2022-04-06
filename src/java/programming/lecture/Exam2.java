package java.programming.lecture;

public class Exam2 {
    public static void main(String[] args) {
        // num1이 가진 숫자와 num2가 가진 숫자를 교환하는 프로그램

        int num1 = 4;
        int num2 = 44;
        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1); // 44
        System.out.println(num2); // 4
    }
}
