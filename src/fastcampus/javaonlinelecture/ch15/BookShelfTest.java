package fastcampus.javaonlinelecture.ch15;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("최성욱1");
        bookQueue.enQueue("최성욱2");
        bookQueue.enQueue("최성욱3");
        bookQueue.enQueue("최성욱4");
        bookQueue.enQueue("최성욱5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
