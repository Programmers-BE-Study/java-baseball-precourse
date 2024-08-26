package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.Result;
import baseball.service.BaseballService;
import baseball.utils.constant.Numbers;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private final Computer computer;
    private final BaseballService baseballService;

    public BaseballController(Computer computer, BaseballService service) {
        this.computer = computer;
        this.baseballService = service;
    }

    public void start() throws IllegalArgumentException{
        do {
            play();
        } while(!isExit());
    }

    private void play() throws IllegalArgumentException{
        computer.createAnswer();
        Result result;
        do {
            String numbers = InputView.printNumbersInput();
            Player player = baseballService.getPlayer(numbers);
            result = baseballService.playOneRound(computer, player);
            OutputView.printResult(result);
        } while(result.getStrikeCount() != Numbers.NUMBERS_SIZE.getNumber());
        OutputView.printEndGame();
    }

    private boolean isExit() {
        return baseballService.checkExit(InputView.isExit());
    }
}
