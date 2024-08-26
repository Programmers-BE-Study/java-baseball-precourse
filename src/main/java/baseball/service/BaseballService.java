package baseball.service;

import baseball.model.Computer;
import baseball.model.Judgement;
import baseball.model.Player;
import baseball.model.Result;
import baseball.utils.constant.Command;
import baseball.utils.constant.Numbers;
import baseball.utils.constant.ValidatorKey;
import baseball.utils.valid.Validator;
import baseball.utils.valid.Validators;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BaseballService {

    public boolean checkExit(String input) throws IllegalArgumentException{
        Validator validator = Validators.getValidator(ValidatorKey.COMMAND);
        return Objects.equals(Command.getCommand(validator.validate(input)), Command.EXIT);
    }

    public Player getPlayer(String numbers) {
        Validator validator = Validators.getValidator(ValidatorKey.PLAYER_INPUT);
        List<Integer> playerNumbers = createPlayerNumbers(validator.validate(numbers));
        return new Player(playerNumbers);
    }

    private List<Integer> createPlayerNumbers(String validate) {
        return Arrays.stream(validate.split(""))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
    }

    public Result playOneRound(Computer computer, Player player) {
        Result result = new Result();
        List<Integer> playerNumbers = player.getNumbers();
        for (int index = Numbers.ZERO.getNumber(); index < Numbers.NUMBERS_SIZE.getNumber(); index++) {
            boolean isStrike = computer.isStrike(playerNumbers.get(index), index);
            boolean isBall = computer.isBall(playerNumbers.get(index), index);
            Judgement judgement = Judgement.judge(isStrike, isBall);
            setResult(result, judgement);
        }
        return result;
    }

    private void setResult(Result result, Judgement judgement) {
        result.setResultByJudgement(judgement);
    }
}
