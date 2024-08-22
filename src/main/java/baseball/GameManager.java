package baseball;

public class GameManager {
    private ProblemProvider problemProvider;
    private AnswerRequester answerRequester;
    private AnswerProcessor answerProcessor;
    private String answer;
    private String userAnswer;
    private boolean isCorrectAnswer;
    private boolean gameReStart;

    public void game() {
        initializeGame();
        answer = problemProvider.generateAnswer();
        while (!isCorrectAnswer) {
            userAnswer = answerRequester.requestUserAnswer();
            isCorrectAnswer = answerProcessor.judge(answer, userAnswer);
        }
        System.out.println(ProblemProvider.DIGITS + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
//        gameReStart = askReStart();
    }

    private void initializeGame() {
        problemProvider = new ProblemProvider();
        answerRequester = new AnswerRequester();
        answerProcessor = new AnswerProcessor();
        answer = null;
        userAnswer = null;
        isCorrectAnswer = false;
        gameReStart = false;
    }

    public boolean gameContinue() {
        return gameReStart;
    }
}
