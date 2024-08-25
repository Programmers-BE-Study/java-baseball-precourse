package baseball.service;

import baseball.domain.Pitch;
import baseball.domain.Result;
import baseball.service.criteria.BallCriteria;
import baseball.service.criteria.StrikeCriteria;

import java.util.List;

public interface Umpire {
    Result judge(Player member);

    default int judgeStrike(Player p1, Player p2, StrikeCriteria<Pitch> criteria) {
        int count = 0;
        List<Pitch> member = p1.getPitches();
        List<Pitch> computer = p2.getPitches();

        for (int i = 0; i < member.size(); i++) {
             if (criteria.evaluate(member.get(i),computer.get(i))) {
                 count++;
             }
        }
        return count;
    }

    default int judgeBall(Player member, Player computer, BallCriteria<Pitch> criteria) {
        int count = 0;
        List<Pitch> p1 = member.getPitches();
        List<Pitch> p2 = computer.getPitches();

        for (int i = 0; i < p1.size(); i++) {
            if (criteria.evaluate(p1.get(i), p2)) {
                count++;
            }
        }
        return count;
    }

    void setComputerPitches();
}
