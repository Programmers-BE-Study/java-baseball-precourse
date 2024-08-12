package baseball.utils.constant;

public enum Messages {

    INPUT_USER_NUMBERS_MSG("숫자를 입력해주세요 : "),
    RESTART_OR_EXIT_MSG("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    RESTART_OR_EXIT_ERROR_MSG("1 또는 2로 입력해야합니다.");

    private final String message;
    Messages(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}
