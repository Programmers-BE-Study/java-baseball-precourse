package baseball.domain;

import static baseball.utility.Constant.NOTHING;

public final class Result {
    private final int strike;
    private final int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return this.strike;
    }

    @Override
    public String toString() {
        if (this.ball == 0 && this.strike == 0) {
            return NOTHING +"\n";
        }
        if (this.ball == 0) {
            return this.strike + "스트라이크\n";
        }
        if (this.strike == 0) {
            return this.ball + "볼\n";
        }
        return this.ball + "볼 " + this.strike + "스트라이크\n";
    }
}
