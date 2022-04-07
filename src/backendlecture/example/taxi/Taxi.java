package backendlecture.example.taxi;

public class Taxi {

    int money;

    public void take(int money) {
        this.money += money;
    }

    public void showInfo() {
        System.out.println("잘 간다. 운수택시 수입은 " + money + "원 입니다.");
    }

}
