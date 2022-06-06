package week06.ex04;

public class MemberTest {
    public static void main(String[] args) {

        MemberDB memberDB = new MemberDB();

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

        memberDB.memberAdd(memberShin);
        memberDB.memberAdd(memberCho);
        memberDB.memberAdd(memberNam);
        memberDB.memberAdd(memberLee);
        memberDB.memberAdd(memberCho2);
        memberDB.memberAdd(memberLee2);
        memberDB.memberAdd(memberKim);
        memberDB.memberAdd(memberKim2);
        memberDB.memberAdd(memberJeong);
        memberDB.memberAdd(memberYun);

        memberDB.memberShowinfo();

        memberDB.memberRemove(1001);

        memberDB.memberShowinfo();

        memberDB.memberRemove(1001);
    }
}
