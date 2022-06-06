package week06.ex05;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> members;

    public MemberHashSet() {
        this.members = new HashSet<Member>();
    }

    public void memberAdd(Member member) {
        members.add(member);
    }

    public boolean memberRemove(int memberId) {
//        iterator
        Iterator<Member> it = members.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            if (member.getMemberId() == memberId) {
                System.out.println(memberId + " 회원님이 삭제 되었습니다.");
                members.remove(member);
                return true;
            }
        }

//        enhanced for loop
//        자바에서는 될 수 있으면 JDK 1.5부터 추가된 Enhanced for 문을 사용하도록 권장하고 있다.
//        for (Member member : members) {
//            if (member.getMemberId() == memberId) {
//                System.out.println(memberId + " 회원님이 삭제 되었습니다.");
//                members.remove(member);
//                return true;
//            }
//        }
        System.out.println(memberId + " 회원님이 존재 하지 않습니다.");
        return false;
    }

    public void memberShowinfo() {
        System.out.println("=====모든 회원 출력=====");

//        iterator
        Iterator<Member> it = members.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            System.out.println(member);
        }

//        enhanced for loop
//        for (Member member : members) {
//            System.out.println(member);
//        }

        System.out.println();
    }
}
