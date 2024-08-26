package baseball.controller;

import static baseball.constant.GameMessages.INPUT_PROMPT;

import baseball.model.BallCount;
import baseball.model.Numbers;
import baseball.service.BaseBallService;
import baseball.service.NumberGenerator;
import baseball.view.Input;
import baseball.view.Output;

public class BaseBallGameManager implements Runnable {

  private final int COUNT_OF_NUMBERS = 3;

  private final BaseBallService baseBallService;
  private final NumberGenerator generator;
  private final Input input;
  private final Output output;


  public BaseBallGameManager(BaseBallService baseBallService, NumberGenerator generator,
      Input input, Output output) {
    this.baseBallService = baseBallService;
    this.generator = generator;
    this.input = input;
    this.output = output;
  }

  @Override
  public void run() {
    Numbers answer = generator.generateUniqueNumbers(COUNT_OF_NUMBERS);

    while (true) {
      String inputString = input.readLineWithMessage(INPUT_PROMPT);
      Numbers guess = Numbers.fromString(inputString);

      BallCount result = baseBallService.compareNumbers(answer, guess);
      output.printBallCount(result);
    }

  }
}
