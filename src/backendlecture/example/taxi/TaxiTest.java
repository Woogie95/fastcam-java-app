package backendlecture.example.taxi;

public class TaxiTest {
    public static void main(String[] args) {
        User user = new User("최성욱", 20000);
        User user1 = new User("홍길동", 50000);


        Taxi taxi = new Taxi();

        user.takeTaxi(taxi);
        user1.takeTaxi(taxi);

        user.showInfo();
        taxi.showInfo();
        System.out.println();
        user1.showInfo();
        taxi.showInfo();
    }
}
