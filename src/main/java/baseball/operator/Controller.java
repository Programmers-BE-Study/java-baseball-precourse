package baseball.operator;

import baseball.View;
import camp.nextstep.edu.missionutils.Console;

public class Controller {

    private final BaseballGame baseballGame;

    public void gameStart() {  // 한 게임 시작
        while (!baseballGame.terminate) {  // 한 이닝 종료
            baseballGame.inningStart();
        }
        if (wannaRestart()) {
            baseballGame.setUp();
            gameStart();
        }
    }

    private boolean wannaRestart() {
        View.restartOrNot();

        String restartOrNot = Console.readLine();
        if (!restartOrNot.equals("1") && !restartOrNot.equals("2")) {
            throw new IllegalArgumentException();
        }
        return restartOrNot.equals("1");
    }

    public Controller(BaseballGame baseballGame) {
        this.baseballGame = baseballGame;
    }
}
