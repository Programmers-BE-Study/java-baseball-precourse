package baseball.config;

import baseball.controller.BaseballController;
import baseball.model.Computer;
import baseball.service.BaseballService;
import baseball.utils.generate.RandomNumberGenerator;
import baseball.utils.valid.Validator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppConfig {

    public static BaseballController getInstance() {
        return Singleton.baseballController;
    }

    private static class Singleton {

        private static final BaseballController baseballController = createController();

        private static BaseballController createController() {
            return new BaseballController(createComputer(), new BaseballService());
        }

        private static Computer createComputer() {
            return new Computer(new RandomNumberGenerator());
        }
    }
}
