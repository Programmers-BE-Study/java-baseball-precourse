package baseball.model;

public class BallCount {
  private int strike;
  private int ball;

  public BallCount(int strike, int ball) {
    this.strike = strike;
    this.ball = ball;
  }

  public int getStrike() {
    return strike;
  }

  public int getBall() {
    return ball;
  }

  @Override
  public String toString() {
    if (strike == 0 && ball == 0) {
      return "낫싱";
    } else if (strike == 0) {
      return ball + "볼";
    } else if (ball == 0) {
      return strike + "스트라이크";
    } else {
      return ball + "볼 " + strike + "스트라이크";
    }
  }

  public boolean isCorrect() {
    return this.strike == 3;
  }
}
