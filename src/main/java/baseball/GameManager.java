package baseball;


public class GameManager {
    private ProblemProvider problemProvider;
    private AnswerRequester answerRequester;
    private AnswerProcessor answerProcessor;
    private ReStartManager reStartManager;
    private String answer;
    private String userAnswer;
    private boolean success;

    public void game() {
        initializeGame();
        answer = problemProvider.generateAnswer();
        do {
            userAnswer = answerRequester.requestUserAnswer();
            success = answerProcessor.judge(answer, userAnswer);
        } while (!success);
        System.out.println(ProblemProvider.DIGITS + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
        reStartManager.askReStart();
    }

    private void initializeGame() {
        problemProvider = new ProblemProvider();
        answerRequester = new AnswerRequester();
        answerProcessor = new AnswerProcessor();
        reStartManager = new ReStartManager();
        answer = null;
        userAnswer = null;
        success = false;
    }

    public boolean gameContinue() {
        return reStartManager.checkReStart();
    }
}