package baseball;

public class GameManager {
    private final ProblemProvider problemProvider = new ProblemProvider();
    private final AnswerRequester answerRequester = new AnswerRequester();
    private final AnswerProcessor answerProcessor = new AnswerProcessor();
    private boolean isGameOver = false;
    private String answer;

    public void game() throws IllegalArgumentException{
        answer = problemProvider.generateAnswer();

    }

    public boolean done() {
        return isGameOver;
    }
}
