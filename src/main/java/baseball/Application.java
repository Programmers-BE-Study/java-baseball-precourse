package baseball;

import baseball.config.AppConfig;
import baseball.controller.BaseballController;

public class Application {
    public static void main(String[] args) {
        BaseballController controller = AppConfig.getInstance();
        controller.start();
    }
}
