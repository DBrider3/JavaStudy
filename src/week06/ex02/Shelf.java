package week06.ex02;

import java.util.ArrayList;

public class Shelf {
    private ArrayList<String> shelf;

    public Shelf() {
        this.shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
