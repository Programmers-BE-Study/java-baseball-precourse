package baseball.service;

import static baseball.constant.ErrorMessages.INVALID_CHOICE_PROMPT;

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

  public boolean isExitChoice(String userChoice) {
    validateChoice(userChoice);
    return userChoice.equals("2");
  }

  private void validateChoice(String userChoice) {
    if (!userChoice.equals("1") && !userChoice.equals("2")) {
      throw new IllegalArgumentException(INVALID_CHOICE_PROMPT);
    }
  }
}
