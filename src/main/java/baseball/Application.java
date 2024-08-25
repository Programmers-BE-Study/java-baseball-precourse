package baseball;

import baseball.utility.AppConfig;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        AppConfig appConfig = new AppConfig();
        appConfig.controller().gameStart();
    }
}
