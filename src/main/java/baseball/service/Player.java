package baseball.service;

import baseball.domain.Pitch;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Player {
    protected List<Pitch> pitches;

    public List<Pitch> getPitches() {
        if (pitches == null) {
            return new ArrayList<>(); // 중복 조심
        }
        return pitches;
    }

    public void setPitches(List<Pitch> pitches) {

    }
    public void setPitches() {

    }

    public List<Pitch> generatePitches() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);

        return randomNumbers.stream()
                .map(Pitch::new)
                .collect(Collectors.toList());
    }
}
