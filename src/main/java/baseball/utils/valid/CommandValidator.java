package baseball.utils.valid;

import baseball.utils.constant.Command;
import baseball.utils.constant.Messages;

public class CommandValidator implements Validator {

    @Override
    public String validate(String input) {
        if(!input.equals(Command.RESTART.toString()) && !input.equals(Command.EXIT.toString())) {
            throw new IllegalArgumentException(Messages.RESTART_OR_EXIT_ERROR_MSG.toString());
        }

        return input;
    }
}
