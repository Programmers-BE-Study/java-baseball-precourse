package baseball.utils.constant;

public enum Numbers {

    LIST_SIZE(3),
    MIN(1),
    MAX(9);

    private final int number;
    Numbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
