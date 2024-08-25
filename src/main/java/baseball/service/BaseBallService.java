package baseball.service;

import baseball.model.BallCount;
import baseball.model.Numbers;
import java.util.Arrays;

public class BaseBallService {

  public BallCount compareNumbers(Numbers answer, Numbers guess) {
    int strikes = 0;
    int balls = 0;

    for (int i = 0; i < answer.getNums().length; i++) {
      if (answer.getNums()[i].equals(guess.getNums()[i])) {
        strikes++;
      } else if (Arrays.asList(answer.getNums()).contains(guess.getNums()[i])) {
        balls++;
      }
    }

    return new BallCount(strikes, balls);
  }
}
