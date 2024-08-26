package baseball.service;

import static baseball.constant.ErrorMessages.INVALID_CHOICE_PROMPT;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import baseball.model.BallCount;
import baseball.model.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseBallServiceTest {

  private BaseBallService baseBallService;

  @BeforeEach
  void setup() {
    baseBallService = new BaseBallService();
  }


  @DisplayName("낫싱일 경우의 결과를 반환한다")
  @Test
  void 낫싱일_경우의_결과를_반환한다() {
    // given
    Numbers answer = new Numbers(new Integer[]{1, 2, 3});
    Numbers input = new Numbers(new Integer[]{4, 5, 6});

    // when
    BallCount result = baseBallService.compareNumbers(answer, input);

    // then
    assertThat(result.getStrike()).isEqualTo(0);
    assertThat(result.getBall()).isEqualTo(0);
  }

  @DisplayName("스트라이크와 볼이 있는 경우의 결과를 반환한다")
  @Test
  void 스트라이크와_볼이_있는_경우의_결과를_반환한다() {
    // given
    Numbers answer = new Numbers(new Integer[]{1, 2, 3});
    Numbers input = new Numbers(new Integer[]{1, 3, 4});

    // when
    BallCount result = baseBallService.compareNumbers(answer, input);

    // then
    assertThat(result.getStrike()).isEqualTo(1);
    assertThat(result.getBall()).isEqualTo(1);
  }

  @DisplayName("볼만 있는 경우의 결과를 반환한다")
  @Test
  void 볼만_있는_경우의_결과를_반환한다() {
    // given
    Numbers answer = new Numbers(new Integer[]{1, 2, 3});
    Numbers input = new Numbers(new Integer[]{3, 1, 2});

    // when
    BallCount result = baseBallService.compareNumbers(answer, input);

    // then
    assertThat(result.getStrike()).isEqualTo(0);
    assertThat(result.getBall()).isEqualTo(3);
  }

  @DisplayName("스트라이크만 있는 경우의 결과를 반환한다")
  @Test
  void 스트라이크만_있는_경우의_결과를_반환한다() {
    // given
    Numbers answer = new Numbers(new Integer[]{1, 2, 3});
    Numbers input = new Numbers(new Integer[]{1, 2, 3});

    // when
    BallCount result = baseBallService.compareNumbers(answer, input);

    // then
    assertThat(result.getStrike()).isEqualTo(3);
    assertThat(result.getBall()).isEqualTo(0);
  }

  @DisplayName("isExitChoice 메서드가 올바르게 동작한다.")
  @Test
  void isExitChoice_메서드가_올바르게_동작한다() {
    // given
    String userChoiceOne = "1";
    String userChoiceTwo = "2";

    // when
    boolean exitChoiceOne = baseBallService.isExitChoice(userChoiceOne);
    boolean exitChoiceTwo = baseBallService.isExitChoice(userChoiceTwo);

    // then
    assertThat(exitChoiceOne).isFalse();
    assertThat(exitChoiceTwo).isTrue();
  }

  @DisplayName("isExitChoice 메서드가 올바르게 동작한다(예외).")
  @Test
  void isExitChoice_메서드가_올바르게_동작한다_예외() {
    // given
    String userChoiceOne = "a";
    String userChoiceTwo = "3";

    // when / then
    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> baseBallService.isExitChoice(userChoiceOne))
        .withMessageContaining(INVALID_CHOICE_PROMPT);

    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> baseBallService.isExitChoice(userChoiceTwo))
        .withMessageContaining(INVALID_CHOICE_PROMPT);

  }
}