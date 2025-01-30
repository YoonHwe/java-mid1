package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();
        Arrays.sort(lottoNumbers);
        System.out.println("로또 번호 : " + Arrays.toString(lottoNumbers));
    }
}
