package baseball.domain;

import baseball.service.Player;

public class Computer extends Player {

    @Override
    public void setPitches() {
        pitches = generatePitches();
        System.out.println("computer 정답은 = " + getPitches().get(0).getPitch() + " " + getPitches().get(1).getPitch() + " " + getPitches().get(2).getPitch());
    }
}
