package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallCountTest {

  @Test
  @DisplayName("BallCount의 toString 메서드가 올바르게 동작한다")
  void BallCount의_toString_메서드가_올바르게_동작한다() {
    // given
    BallCount ballCount = new BallCount(1, 1);

    // when
    String result = ballCount.toString();

    // then
    assertThat(result).isEqualTo("1볼 1스트라이크");
  }

  @Test
  @DisplayName("BallCount의 toString 메서드가 올바르게 동작한다_낫싱")
  void BallCount의_toString_메서드가_올바르게_동작한다_낫싱() {
    // given
    BallCount ballCount = new BallCount(0, 0);

    // when
    String result = ballCount.toString();

    // then
    assertThat(result).isEqualTo("낫싱");
  }

  @Test
  @DisplayName("BallCount의 toString 메서드가 올바르게 동작한다_3스트라이크")
  void BallCount의_toString_메서드가_올바르게_동작한다_3스트라이크() {
    // given
    BallCount ballCount = new BallCount(3, 0);

    // when
    String result = ballCount.toString();

    // then
    assertThat(result).isEqualTo("3스트라이크");
  }

  @DisplayName("BallCount의 isCorrect 메서드가 올바르게 동작한다.")
  @Test
  void BallCount의_isCorrect_메서드가_올바르게_동작한다() {
    // given
    BallCount ballCountOne = new BallCount(3, 0);
    BallCount ballCountTwo = new BallCount(1, 1);

    // when
    boolean correctOne = ballCountOne.isCorrect();
    boolean correctTwo = ballCountTwo.isCorrect();

    // then
    assertThat(correctOne).isTrue();
    assertThat(correctTwo).isFalse();
  }
}