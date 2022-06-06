package week05.ex04;

public class RoundRobin implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객 등급 상관없이 순서대로 전화를 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("들어오는 전화 순서대로 상담원에게 하나씩 배분합니다.");
    }
}
