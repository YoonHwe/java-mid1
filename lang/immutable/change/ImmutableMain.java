package lang.immutable.change;

public class ImmutableMain {

    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj obj2 = obj.add(20);
        //불변도 유지, 새로운 결과 생김
        System.out.println(obj2.getValue());
    }
}
