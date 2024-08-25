package baseball.service;

import baseball.domain.Pitch;
import baseball.domain.Result;

import java.util.List;

public class BaseballServiceImpl implements BaseballService {

    private final Player member;
    private final Umpire umpire;  // Computer 와 Member 값 비교

    @Override
    public Result evaluate(List<Pitch> pitches) {
        this.member.setPitches(pitches);
        return umpire.judge(member);
    }

    public BaseballServiceImpl(Umpire umpire, Player member) {
        this.umpire = umpire;
        this.member = member;
    }

    @Override
    public void updateComputerPitches() {
        umpire.setComputerPitches();
    }
}
