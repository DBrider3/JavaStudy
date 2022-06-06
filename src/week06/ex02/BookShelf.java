package week06.ex02;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String s) {
        getShelf().add(s);
    }

    @Override
    public String deQueue() {
        return getShelf().remove(0);
    }
}
