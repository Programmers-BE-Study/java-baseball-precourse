package baseball.domain;

import baseball.service.Player;
import baseball.service.Umpire;

public class UmpireImpl implements Umpire {

    private final Computer computer;

    @Override
    public Result judge(Player member) {
        int strike = judgeStrike(member, computer, Object::equals);
        int ballPlusStrike = judgeBall(member, computer, (p1, p2) -> p2.contains(p1));
        int ball = ballPlusStrike - strike;

        return new Result(strike, ball);
    }

    @Override
    public void setComputerPitches() {
        computer.setPitches();
    }

    public UmpireImpl(Computer computer) {
        this.computer = computer;
        this.computer.setPitches();
    }
}
