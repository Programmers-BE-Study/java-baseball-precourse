package baseball;

public class GameManager {
    private ProblemProvider problemProvider;
    private AnswerRequester answerRequester;
    private AnswerProcessor answerProcessor;
    private boolean isGameOver;
    private String answer;
    private String userAnswer;

    public void game() {
        initializeGame();
        answer = problemProvider.generateAnswer();
        while (!isCorrectUserAnswer()) {
            userAnswer = answerRequester.requestUserAnswer();

        }

    }

    private void initializeGame() {
        problemProvider = new ProblemProvider();
        answerRequester = new AnswerRequester();
        answerProcessor = new AnswerProcessor();
        isGameOver = false;
        answer = null;
        userAnswer = null;
    }

    public boolean isCorrectUserAnswer() {
/*
        if (answer == null || userAnswer == null) {
            return false;
        }
*/
        return answer.equals(userAnswer);
    }

    public boolean done() {
        return isGameOver;
    }
}
