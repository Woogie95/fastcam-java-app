package fastcampus.chapter08;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int num1 = Integer.parseInt(args[1]);

            System.out.println("나누기 결과 : " + num / num1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("반드시 두 개의 정수를 입해야 한다.");
        }
    }
}
