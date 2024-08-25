package baseball;

import baseball.controller.BaseBallGameManager;
import baseball.service.BaseBallService;
import baseball.service.RandomsNumberGenerator;
import baseball.view.ConsoleInput;

public class Application {

  public static void main(String[] args) {
    //TODO: 숫자 야구 게임 구현
    new BaseBallGameManager(new BaseBallService(), new RandomsNumberGenerator(),
        new ConsoleInput()).run();
  }
}
