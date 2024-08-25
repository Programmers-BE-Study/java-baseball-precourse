package baseball.service;

import baseball.model.Numbers;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.stream.Stream;

public class RandomsNumberGenerator implements NumberGenerator {

  @Override
  public Numbers generateUniqueNumbers(int count) {
    return new Numbers(
        Stream.generate(() -> Randoms.pickNumberInRange(1, 9))
            .distinct()
            .limit(count)
            .toArray(Integer[]::new));
  }
}
