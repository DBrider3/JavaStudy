package week06.ex06;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        // Object <T> 강제형 변환을 해줘야 하는데, String 이면 바로 써도 가능
        // downcasting instanceof
        return (s1.compareTo(s2)) * -1;
    }
}
