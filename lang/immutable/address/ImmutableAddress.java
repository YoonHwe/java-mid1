package lang.immutable.address;

public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    /*
    public void setValue(String value) {
        this.value = value;
    }*/ // final로 인해 setter는 사용 불가.ㅊ
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
