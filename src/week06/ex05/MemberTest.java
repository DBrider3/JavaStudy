package week06.ex05;

public class MemberTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberShin = new Member(1000, "donshin");
        Member memberCho = new Member(1001, "donshin");
        Member memberNam = new Member(1002, "jnam");
        Member memberLee = new Member(1003, "jiholee");
        Member memberCho2 = new Member(1004, "hyunjcho");
        Member memberLee2 = new Member(1006, "dohyulee");
        Member memberKim = new Member(1007, "ikkim");
        Member memberKim2 = new Member(1008, "jonkim");
        Member memberJeong = new Member(1009, "hjeong");
        Member memberYun = new Member(1010, "jiyun");

        memberCho.setMemberName("dcho");

        memberHashSet.memberAdd(memberShin);
        memberHashSet.memberAdd(memberCho);
        memberHashSet.memberAdd(memberNam);
        memberHashSet.memberAdd(memberLee);
        memberHashSet.memberAdd(memberCho2);
        memberHashSet.memberAdd(memberLee2);
        memberHashSet.memberAdd(memberKim);
        memberHashSet.memberAdd(memberKim2);
        memberHashSet.memberAdd(memberJeong);
        memberHashSet.memberAdd(memberYun);

        memberHashSet.memberShowinfo();

        memberHashSet.memberRemove(1001);

        memberHashSet.memberShowinfo();

        memberHashSet.memberRemove(1001);

        // 중복 체크 hashcode, equal
        Member memberTemp = new Member(1010, "donshin");
        memberHashSet.memberAdd(memberTemp);
        memberHashSet.memberShowinfo();



    }
}
