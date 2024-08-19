package baseball;

public class GameManager {
    private final ProblemProvider problemProvider;
    private final AnswerRequester answerRequester;
    private final AnswerProcessor answerProcessor;
    private static final boolean IS_GAME_OVER = false;

    public GameManager() {
        problemProvider = new ProblemProvider();
        answerRequester = new AnswerRequester();
        answerProcessor = new AnswerProcessor();
    }

    public void game() {

    }

    public boolean done() {
        return IS_GAME_OVER;
    }
}
