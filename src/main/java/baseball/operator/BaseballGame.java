package baseball.operator;

import baseball.View;
import baseball.domain.Pitch;
import baseball.domain.Result;
import baseball.utility.DataConverter;
import baseball.service.BaseballService;

import java.util.List;

public class BaseballGame {

    public boolean terminate = false;
    private final BaseballService baseballService;

    public void inningStart() {
        View.inputNumber();
        List<Pitch> inputPitches = DataConverter.readData();
        Result result = baseballService.evaluate(inputPitches);

        View.showResult(result);
        analyzeResult(result);
    }


    private void analyzeResult(Result result) {
        if (result.getStrike() == 3) {
            terminate = true;
            View.congratulation();
            return;
        }
        terminate = false;
    }

    public void setUp() {
        terminate = false;
        baseballService.updateComputerPitches();
    }

    public BaseballGame(BaseballService service) {
        this.baseballService = service;
    }
}
