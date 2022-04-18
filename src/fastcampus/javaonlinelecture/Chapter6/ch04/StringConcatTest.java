package fastcampus.javaonlinelecture.Chapter6.ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        StringConcatImpl str = new StringConcatImpl();
        String str1 = "Hello";
        String str2 = "World!";

        str.makeString(str1, str2);

        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString(str1, str2);

    }
}
