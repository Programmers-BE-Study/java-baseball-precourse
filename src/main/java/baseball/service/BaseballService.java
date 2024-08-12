package baseball.service;

import baseball.utils.constant.Command;
import baseball.utils.constant.ValidatorKey;
import baseball.utils.valid.Validator;
import baseball.utils.valid.Validators;

import java.util.Objects;

public class BaseballService {

    public boolean checkExit(String input) throws IllegalArgumentException{
        Validator validator = Validators.getValidator(ValidatorKey.COMMAND);
        return Objects.equals(Command.getCommand(validator.validate(input)), Command.EXIT);
    }
}
