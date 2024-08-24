package baseball.utils.valid;


import baseball.utils.constant.Errors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerInputTest {

    private final PlayerInputValidator validator = new PlayerInputValidator();

    @Test
    @DisplayName("정상 실행")
    void normalTest() {
        String input = "145";
        assertDoesNotThrow(() -> validator.validate(input));
    }

    @Test
    @DisplayName("범위에 포함하지 않는 숫자를 입력")
    void notInRangeTest() {
        String input = "490";
        assertThrows(IllegalArgumentException.class,
                    () -> validator.validate(input),
                    Errors.PLAYER_NUMBER_LENGTH_NOT_THREE_MSG::getErrorMsg);

    }

    @Test
    @DisplayName("입력 길이 초과")
    void inputRangeOverTest() {
        String input = "4912";
        assertThrows(IllegalArgumentException.class,
                () -> validator.validate(input),
                Errors.PLAYER_NUMBER_LENGTH_NOT_THREE_MSG::getErrorMsg);

    }

    @Test
    @DisplayName("입력값에 문자 포함")
    void inputContainsLetterTest() {
        String input = "4a2";
        assertThrows(IllegalArgumentException.class,
                () -> validator.validate(input),
                Errors.PLAYER_NUMBER_LENGTH_NOT_THREE_MSG::getErrorMsg);

    }

    @Test
    @DisplayName("입력값에 중복된 숫자 포함")
    void duplicateInputTest() {
        String input = "442";
        assertThrows(IllegalArgumentException.class,
                () -> validator.validate(input),
                Errors.NUMBER_DUPLICATED_MSG::getErrorMsg);

    }
}
