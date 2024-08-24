package baseball.utils.valid;

import baseball.utils.constant.Command;
import baseball.utils.constant.Errors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {

    @Mock
    private final CommandValidator validator = new CommandValidator();
    @Test
    @DisplayName("1은 재시작")
    void restartTest() {
        String input = "1";
        assertEquals(validator.validate(input), Command.RESTART.toString());
    }

    @Test
    @DisplayName("2는 종료")
    void exitTest() {
        String input = "2";
        assertEquals(validator.validate(input), Command.EXIT.toString());
    }

    @Test
    @DisplayName("이외의 값은 예외를 던진다")
    void invalidTest() {
        String[] inputs = {"3", "4a", "!2389"};
        for (String input : inputs) {
            assertThrows(IllegalArgumentException.class,
                    () -> validator.validate(input),
                    Errors.RESTART_OR_EXIT_MSG::getErrorMsg);
        }
    }
}
