package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleInput implements Input {

  @Override
  public String input(String s) {
    System.out.print(s);
    return Console.readLine();
  }
}
