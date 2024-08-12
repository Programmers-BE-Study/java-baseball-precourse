package baseball.controller;

import baseball.model.Computer;
import baseball.service.BaseballService;
import baseball.utils.constant.Command;
import baseball.view.InputView;

public class BaseballController {

    private final Computer computer;
    private final BaseballService baseballService;

    public BaseballController(Computer computer, BaseballService service) {
        this.computer = computer;
        this.baseballService = service;
    }

    public void start() throws IllegalArgumentException{
        while(true) {
            play();
            if(isExit()) {
                break;
            }
        }
    }

    private void play() throws IllegalArgumentException{
        //컴퓨터의 숫자 생성
        computer.createAnswer();
        String numbers = InputView.printNumbersInput();
    }

    private boolean isExit() {
        return baseballService.checkExit(InputView.isExit());
    }
}
