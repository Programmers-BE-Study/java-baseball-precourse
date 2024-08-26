package baseball.view;

import baseball.model.BallCount;

public interface Output {

  void printBallCount(BallCount ballCount);

  void printMessage(String message);
}
