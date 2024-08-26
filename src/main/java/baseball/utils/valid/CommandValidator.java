package baseball.utils.valid;

import baseball.utils.constant.Command;
import baseball.utils.constant.Errors;

public class CommandValidator implements Validator {

    @Override
    public String validate(String input) {
        isRetryOrExit(input);
        return input;
    }

    private void isRetryOrExit(String input) {
        if(!input.equals(Command.RESTART.toString()) && !input.equals(Command.EXIT.toString())) {
            throw new IllegalArgumentException(Errors.RESTART_OR_EXIT_MSG.toString());
        }
    }
}
