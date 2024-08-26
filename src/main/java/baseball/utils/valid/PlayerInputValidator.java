package baseball.utils.valid;

import baseball.utils.constant.Errors;

import java.util.Arrays;

public class PlayerInputValidator implements Validator{
    @Override
    public String validate(String input) {
        canParse(input);
        isDuplicate(input);
        return input;
    }

    private void canParse(String input) {
        if(!input.matches("[1-9]{3}")) {
            throw new IllegalArgumentException(Errors.PLAYER_NUMBER_LENGTH_NOT_THREE_MSG.toString());
        }
    }

    private void isDuplicate(String input) {
        int count = (int) Arrays.stream(input.split(""))
                    .distinct()
                    .count();

        if(input.length() != count) {
            throw new IllegalArgumentException(Errors.NUMBER_DUPLICATED_MSG.toString());
        }
    }
}
