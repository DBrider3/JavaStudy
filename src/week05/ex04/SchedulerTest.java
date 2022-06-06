package week05.ex04;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {

        System.out.println("전화 상담 할당 방식을 선택 하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");

        Scheduler scheduler = null;
        char inputValue = (char) System.in.read();
        if (inputValue == 'r' || inputValue == 'R')
            scheduler = new RoundRobin();
        else if (inputValue == 'l' || inputValue == 'L')
            scheduler = new LeastJob();
        else if (inputValue == 'p' || inputValue == 'P')
            scheduler = new PriorityAllocation();
        else
            System.out.println("잘못된 입력입니다.");
        if (scheduler != null)
        {
            scheduler.getNextCall();
            scheduler.sendCallToAgent();
        }
    }
}
