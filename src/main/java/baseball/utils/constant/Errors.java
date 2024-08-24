package baseball.utils.constant;

public enum Errors {
    RESTART_OR_EXIT_MSG("1 또는 2로 입력해야합니다."),
    PLAYER_NUMBER_LENGTH_NOT_THREE_MSG("길이가 3인 숫자 3개를 입력해야합니다."),

    NUMBER_DUPLICATED_MSG("중복되는 숫자를 입력할 수 없습니다");

    private final String errorMsg;

    Errors(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
