package baseball.utils.generate;

import baseball.utils.constant.Numbers;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator implements Generator {
    @Override
    public List<Integer> generate() {
        ArrayList<Integer> numbers = new ArrayList<>();

        while(numbers.size() < Numbers.NUMBERS_SIZE.getNumber()) {
            int number = Randoms.pickNumberInRange(Numbers.MIN.getNumber(), Numbers.MAX.getNumber());
            if(!numbers.contains(number)) {
                numbers.add(number);
            }
        }
        return numbers;
    }
}
