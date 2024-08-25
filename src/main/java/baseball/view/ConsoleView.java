package baseball.view;

import baseball.model.BallCount;
import camp.nextstep.edu.missionutils.Console;

public class ConsoleView implements Input, Output{

  @Override
  public String input(String s) {
    System.out.print(s);
    return Console.readLine();
  }

  @Override
  public void printBallCount(BallCount ballCount) {
    System.out.println(ballCount);
  }
}
