package week06.ex07;


import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
    private TreeSet<Member> members;

    public MemberTreeSet() {
        this.members = new TreeSet<Member>();
    }

    public void memberAdd(Member member) {
        members.add(member);
    }

    public boolean memberRemove(int memberId) {
        Iterator<Member> it = members.iterator();
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

        Iterator<Member> it = members.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            System.out.println(member);
        }

        System.out.println();
    }
}
