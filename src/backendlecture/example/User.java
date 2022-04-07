package backendlecture.example;

public class User {

    public int height;
    public int weight;
    public String name;
    public int age;

    public User(int height, int weight, String name, int age) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;

    }

    public String ShowInfo() {
        return "키가 " + height + " 몸무게가 " + weight + " 킬로인 남성이 있습니다. "
                + "이름은 " + name + " 나이는 " + age + "세 입니다.";
    }

}
