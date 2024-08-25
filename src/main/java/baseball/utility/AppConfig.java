package baseball.utility;

import baseball.operator.BaseballGame;
import baseball.operator.Controller;
import baseball.domain.Computer;
import baseball.domain.Member;
import baseball.service.BaseballService;
import baseball.service.BaseballServiceImpl;
import baseball.domain.UmpireImpl;

public class AppConfig {

    public Controller controller() {
        return new Controller(baseballGame());
    }

    public BaseballGame baseballGame() {
        return new BaseballGame(baseballService());
    }

    public BaseballService baseballService() {
        return new BaseballServiceImpl(new UmpireImpl(new Computer()), new Member());
    }
}
