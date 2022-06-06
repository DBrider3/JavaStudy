package week06.ex01;

public class MyClass implements MyInterface{

    @Override
    public void myMethod() {
        System.out.println("myMethod function 호출");
    }

    @Override
    public void x() {
        System.out.println("x function 호출");
    }

    @Override
    public void y() {
        System.out.println("y function 호출");
    }

}
