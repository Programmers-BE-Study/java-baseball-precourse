package baseball;

import baseball.controller.BaseBallGameManager;
import baseball.service.BaseBallService;
import baseball.service.NumberGenerator;
import baseball.service.RandomsNumberGenerator;
import baseball.view.ConsoleView;
import camp.nextstep.edu.missionutils.Console;

public class Application {

  public static void main(String[] args) {
    //TODO: 숫자 야구 게임 구현
    BaseBallService baseBallService = new BaseBallService();
    NumberGenerator generator = new RandomsNumberGenerator();
    ConsoleView view = new ConsoleView();
    new BaseBallGameManager(baseBallService, generator, view, view).run();

  }
}
