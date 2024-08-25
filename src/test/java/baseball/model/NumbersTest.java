package baseball.model;

import static baseball.constant.ErrorMessages.NUMBERS_DUPLICATE_NUM;
import static baseball.constant.ErrorMessages.NUMBERS_INVALID_LENGTH;
import static baseball.constant.ErrorMessages.NUMBERS_NON_DIGIT_CHARACTER;
import static baseball.constant.ErrorMessages.NUMBERS_OUT_OF_RANGE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumbersTest {

  @DisplayName("숫자로 구성된 문자열을 Numbers 객체로 반환한다")
  @Test
  void 숫자로_구성된_문자열을_Numbers_객체로_반환한다() {
    // given
    String input = "123";

    // when
    Numbers numbers = Numbers.fromString(input);

    // then
    assertThat(numbers.getNums().length).isEqualTo(3);
    assertThat(numbers.getNums()).containsExactly(1, 2, 3);
  }

  @DisplayName("중복된 숫자가 있을 경우 에러를 발생시킨다.")
  @Test
  void 중복된_숫자가_있을_경우_에러를_발생시킨다() {
    // given
    String input = "122";

    // when then
    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> Numbers.fromString(input))
        .withMessageContaining(NUMBERS_DUPLICATE_NUM);
  }

  @DisplayName("숫자 이외의 문자가 포함된 경우 에러를 발생시킨다")
  @Test
  void 숫자_이외의_문자가_포함된_경우_에러를_발생시킨다() {
    // given
    String input = "12a";

    // when / then
    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> Numbers.fromString(input))
        .withMessageContaining(NUMBERS_NON_DIGIT_CHARACTER);
  }

  @DisplayName("문자열에 0이 포함된 경우 에러를 발생시킨다")
  @Test
  void 문자열에_0이_포함된_경우_에러를_발생시킨다() {
    // given
    String input = "120";

    // when / then
    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> Numbers.fromString(input))
        .withMessageContaining(NUMBERS_OUT_OF_RANGE);
  }

  @DisplayName("문자열 길이가 3이 아닌경우 에러를 발생시킨다")
  @Test
  void 문자열_길이가_3이_아닌경우_에러를_발생시킨다() {
    // given
    String inputString1 = "1234";
    String inputString2 = "12";

    // when / then
    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> Numbers.fromString(inputString1))
        .withMessageContaining(NUMBERS_INVALID_LENGTH);

    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> Numbers.fromString(inputString2))
        .withMessageContaining(NUMBERS_INVALID_LENGTH);
  }
}