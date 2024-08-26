package baseball.view;

import baseball.utils.constant.Command;
import baseball.utils.constant.Messages;
import baseball.utils.valid.CommandValidator;
import baseball.utils.valid.Validator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String printNumbersInput() {
        System.out.print(Messages.INPUT_USER_NUMBERS_MSG);
        return Console.readLine();
    }

    public static String isExit() {
        System.out.println(Messages.RESTART_OR_EXIT_MSG);
        return Console.readLine();
    }
}
