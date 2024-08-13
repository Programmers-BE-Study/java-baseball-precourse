package baseball.utils.valid;

import baseball.utils.constant.Messages;

public class PlayerInputValidator implements Validator{
    @Override
    public String validate(String input) {
        canParse(input).finish();
        //같은 숫자를 입력한 것도 유효하지 않은 데이터를 입력했다고 해야하나?
        return input;
    }

    private PlayerInputValidator canParse(String input) {
        if(!input.matches("[1-9]{3}")) {
            throw new IllegalArgumentException(Messages.PLAYER_NUMBER_LENGTH_NOT_THREE.toString());
        }
        return this;
    }
}
