package baseball.service;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.Numbers;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomsNumberGeneratorTest {

  private NumberGenerator generator;

  @BeforeEach
  void setup() {
    generator = new RandomsNumberGenerator();
  }


  @DisplayName("중복 없이 count 만큼 랜덤한 숫자를 생성할 수 있다")
  @Test
  void 중복_없이_count_만큼_랜덤한_숫자를_생성할_수_있다() {
    // given
    int count = 3;

    // when
    Numbers numbers = generator.generateUniqueNumbers(count);

    // then
    assertThat(numbers.getNums().length).isEqualTo(count);

    for (Integer n : numbers.getNums()) {
      assertThat(n).isBetween(1, 9);
    }

    Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers.getNums()));
    assertThat(uniqueNumbers.size()).isEqualTo(count);
  }

  @DisplayName("count가 9일때 1부터 9까지 배열을 반환한다")
  @Test
  void count가_9일때_1부터_9까지_배열을_반환한다() {
    // given
    int count = 9;

    // when
    Numbers numbers = generator.generateUniqueNumbers(count);

    // then
    assertThat(numbers.getNums().length).isEqualTo(count);

    for (Integer n : numbers.getNums()) {
      assertThat(n).isBetween(1, 9);
    }

    Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers.getNums()));
    assertThat(uniqueNumbers.size()).isEqualTo(count);
  }

}