package week06.ex08;

import java.util.Iterator;
import java.util.HashMap;

public class MemberHashMap {
    
    private HashMap<Integer, Member> members;

    public MemberHashMap() {
        this.members = new HashMap<Integer, Member>();
    }

    public void memberAdd(Member member) {
        members.put(member.getMemberId(), member);
    }

    public boolean memberRemove(int memberId) {

        if (members.containsKey(memberId)) {
            System.out.println(memberId + " 회원님이 삭제 되었습니다.");
            members.remove(memberId);
            return true;
        }

        System.out.println(memberId + " 회원님이 존재 하지 않습니다.");
        return false;
    }

    public void memberShowinfo() {
        System.out.println("=====모든 회원 출력=====");

        Iterator<Integer> it = members.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            System.out.println(members.get(key));
        }
        System.out.println();
    }
}
