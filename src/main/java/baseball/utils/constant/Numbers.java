package baseball.utils.constant;

public enum Numbers {

    ZERO(0),
    MIN(1),
    NUMBERS_SIZE(3),
    MAX(9);

    private final int number;
    Numbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
