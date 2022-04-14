package fastcampus.javaonlinelecture.ch15;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("Sell Order");
    }
}
