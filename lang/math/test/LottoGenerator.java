package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    private boolean[] lottoSelected;

    public int[] generate() {
        lottoNumbers = new int[6];
        lottoSelected = new boolean[46];
        count = 0;

        while(count < 6) {
            int randomInt = random.nextInt(45) + 1;
            if(lottoSelected[randomInt]) continue;
            lottoNumbers[count] = randomInt;
            lottoSelected[randomInt] = true;
            count++;
        }

        return lottoNumbers;
    }
}
