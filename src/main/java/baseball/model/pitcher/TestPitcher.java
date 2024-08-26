package baseball.model.pitcher;

import baseball.model.vo.BaseballNumber;
import java.util.ArrayList;
import java.util.List;

public class TestPitcher implements Pitcher {

    @Override
    public BaseballNumber generate() {

        List<Integer> testNumber = new ArrayList<>();
        testNumber.add(1); testNumber.add(2); testNumber.add(3);
        return BaseballNumber.of(testNumber);
    }
}
