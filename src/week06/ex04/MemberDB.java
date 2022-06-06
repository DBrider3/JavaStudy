package week06.ex04;

import java.util.ArrayList;
import java.util.ListIterator;

public class MemberDB {
    private ArrayList<Member> members;

    public MemberDB() {
        this.members = new ArrayList<Member>();
    }

    public void memberAdd(Member member) {
        members.add(member);
    }

    public boolean memberRemove(int memberId) {
        // 추가 방법론 ListIterator
        ListIterator<Member> it = members.listIterator();

        while (it.hasNext()) {
            Member member = it.next();
            if (member.getMemberId() == memberId) {
                System.out.println(memberId + " 회원님이 삭제 되었습니다.");
                members.remove(member);
                return true;
            }
        }
        System.out.println(memberId + " 회원님이 존재 하지 않습니다.");
        return false;
    }

    public void memberShowinfo() {
        System.out.println("=====모든 회원 출력=====");

        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println();
    }

}
