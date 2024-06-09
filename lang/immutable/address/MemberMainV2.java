package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원 A, B 모두 처음 주소는 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // memberB.getAddress().setValue("부산"); //컴파일 오류 발생
        memberB.setImmutableAddress(new ImmutableAddress("부산"));
        System.out.println("memberB.address <- 부산");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
