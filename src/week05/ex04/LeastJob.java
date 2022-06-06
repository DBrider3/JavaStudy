package week05.ex04;

public class LeastJob implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객 등급 상관없이 순서대로 전화를 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담을 하지 않는 상담원이나 가장 짧은 대기역을 보유한 상담원에게 배분합니다.");
    }
}
