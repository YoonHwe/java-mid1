package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 회원 A, B 모두 처음 주소는 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.getAddress().setValue("부산"); //문제 발생!!
        System.out.println("memberB.address <- 부산");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
