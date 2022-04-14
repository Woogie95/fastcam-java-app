package fastcampus.chapter05.abstract1;

public class AbstractTest extends Exam {

    public void sayHi() {
        System.out.println("안녕 ?");
    }

    public void printSum(int a, int b) {
        int result = sum(a, b);
        System.out.println(a + " 과 " + b + " 의 합은 " + result + " 다.");
    }

    public static void main(String[] args) {
        AbstractTest at = new AbstractTest();

        at.sayHi();
        at.printSum(10, 50);
    }
}
