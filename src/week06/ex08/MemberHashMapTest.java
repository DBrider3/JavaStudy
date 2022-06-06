package week06.ex08;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.memberAdd(memberLee);
        memberHashMap.memberAdd(memberKim);
        memberHashMap.memberAdd(memberKang);
        memberHashMap.memberAdd(memberHong);

        memberHashMap.memberShowinfo();
        memberHashMap.memberRemove(1004);
        memberHashMap.memberShowinfo();

        // Long, Integer, Double 앞에 대문자 null 쌉가능
    }
}