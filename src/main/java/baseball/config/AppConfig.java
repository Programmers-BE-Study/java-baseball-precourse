package baseball.config;

import baseball.controller.BaseballController;
import baseball.model.Computer;
import baseball.service.BaseballService;
import baseball.utils.generate.RandomNumberGenerator;

public class AppConfig {

    public static BaseballController getController() {
        return Singleton.baseballController;
    }

    private AppConfig() {}
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
