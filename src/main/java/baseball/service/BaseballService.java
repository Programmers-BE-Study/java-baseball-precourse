package baseball.service;

import baseball.domain.Pitch;
import baseball.domain.Result;

import java.util.List;

public interface BaseballService {
    Result evaluate(List<Pitch> pitches);
    void updateComputerPitches();
}
