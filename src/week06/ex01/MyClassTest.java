package week06.ex01;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        X xclass = myClass;
        xclass.x();

        Y yclass = myClass;
        yclass.y();

        MyInterface iClass = myClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
