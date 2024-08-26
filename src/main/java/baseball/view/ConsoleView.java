package baseball.view;

import baseball.model.BallCount;
import camp.nextstep.edu.missionutils.Console;

public class ConsoleView implements Input, Output{

  @Override
  public String readLineWithMessage(String message) {
    System.out.print(message);
    return Console.readLine();
  }

  @Override
  public void printBallCount(BallCount ballCount) {
    System.out.println(ballCount);
  }
}
