package baseball.model;

import static baseball.constant.ErrorMessages.NUMBERS_DUPLICATE_NUM;
import static baseball.constant.ErrorMessages.NUMBERS_INVALID_LENGTH;
import static baseball.constant.ErrorMessages.NUMBERS_NON_DIGIT_CHARACTER;
import static baseball.constant.ErrorMessages.NUMBERS_OUT_OF_RANGE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Numbers {

  private final Integer[] nums;

  public Numbers(Integer[] nums) {
    this.nums = nums;
  }

  public static Numbers fromString(String str) {
    validateString(str);
    Integer[] numbers = convertStringToNumbers(str);
    validateUniqueNumbers(numbers);
    return new Numbers(numbers);
  }

  public Integer[] getNums() {
    return nums;
  }

  private static void validateString(String str) {
    if (str == null || str.length() != 3) {
      throw new IllegalArgumentException(NUMBERS_INVALID_LENGTH);
    }
  }

  private static Integer[] convertStringToNumbers(String str) {
    char[] chars = str.toCharArray();
    Integer[] numbers = new Integer[3];
    for (int i = 0; i < chars.length; i++) {
      if (!Character.isDigit(chars[i])) {
        throw new IllegalArgumentException(NUMBERS_NON_DIGIT_CHARACTER);
      }
      int num = Character.getNumericValue(chars[i]);
      if (num < 1 || num > 9) {
        throw new IllegalArgumentException(NUMBERS_OUT_OF_RANGE);
      }
      numbers[i] = num;
    }
    return numbers;
  }

  private static void validateUniqueNumbers(Integer[] numbers) {
    Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
    if (uniqueNumbers.size() != numbers.length) {
      throw new IllegalArgumentException(NUMBERS_DUPLICATE_NUM);
    }
  }
}
