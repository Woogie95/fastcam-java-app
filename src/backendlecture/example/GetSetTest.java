package backendlecture.example;

public class GetSetTest {
    public static void main(String[] args) {
        GetSet getSet = new GetSet();
        getSet.setAge(28);
        getSet.setName("SungWook");

        String name = getSet.getName();
        int age = getSet.getAge();

        System.out.println("이름은 " + name + " 나이는 " + age);
    }
}
