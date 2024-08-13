package baseball.utils.valid;

public interface Validator {

    String validate(String input);

    default void finish() {}
}
