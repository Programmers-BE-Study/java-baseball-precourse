package baseball.constant;

public final class ErrorMessages {
  public static final String NUMBERS_INVALID_LENGTH = "문자열은 3자리 숫자여야 합니다.";
  public static final String NUMBERS_NON_DIGIT_CHARACTER = "문자열은 숫자만 포함해야 합니다.";
  public static final String NUMBERS_OUT_OF_RANGE = "숫자는 1부터 9 사이여야 합니다.";
  public static final String NUMBERS_DUPLICATE_NUM = "중복된 숫자가 포함되어 있습니다.";

  private ErrorMessages() {}
}