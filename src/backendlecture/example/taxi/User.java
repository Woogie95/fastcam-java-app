package backendlecture.example.taxi;

public class User {

    String userName;
    int money;

    public User(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(3000);
        this.money -= 3000;
    }

    public void showInfo() {
        System.out.println(userName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
