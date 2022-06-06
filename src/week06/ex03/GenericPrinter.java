package week06.ex03;

public class GenericPrinter<T> {

    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
//        return ""+material;
        return material.toString(); // 앞에 있는게 킹왕짱 흡수된다.
    }
}
