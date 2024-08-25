package baseball;

import baseball.domain.Result;

import static baseball.utility.Constant.*;

public final class View {

    public static void inputNumber() {
        System.out.println(INPUT_NUMBER);
    }
    public static void showResult(Result result) {
        System.out.println(result.toString());
    }
    public static void congratulation() {
        System.out.println(SUCCESS);
    }
    public static void restartOrNot() {
        System.out.println(RESTART_OR_NOT);
    }

    private View() {

    }
}
