package baseball.domain;

import baseball.service.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Member extends Player {

    @Override
    public void setPitches(List<Pitch> pitches) {
        Set<Pitch> pitchSet = new HashSet<>(pitches);

        if (pitchSet.size() != pitches.size()) {
            throw new IllegalArgumentException();
        }

        this.pitches = pitches;
    }

}
