package baseball.view;

import baseball.model.BallCount;
import camp.nextstep.edu.missionutils.Console;
import java.sql.SQLOutput;

public class ConsoleView implements Input, Output{

  @Override
  public String readLineWithMessage(String message) {
    System.out.print(message);
    return Console.readLine();
  }

  @Override
  public String readLineWithMessageAndNewline(String message) {
    System.out.println(message);
    return Console.readLine();
  }

  @Override
  public void printBallCount(BallCount ballCount) {
    System.out.println(ballCount);
  }

  @Override
  public void printMessage(String message) {
    System.out.println(message);
  }
}
