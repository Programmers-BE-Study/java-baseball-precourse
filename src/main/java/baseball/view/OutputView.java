package baseball.view;

import baseball.model.Result;
import baseball.utils.constant.Messages;

public class OutputView {

    public static void printEndGame() {
        System.out.println(Messages.END_GAME_MSG);
    }

    public static void printResult(Result result) {
        System.out.println(result);
    }
}
