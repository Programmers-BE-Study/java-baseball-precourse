package baseball;

public class AnswerProcessor {
    static class Score{
        int ball;
        int strike;
        boolean nothing;
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (nothing) {
                sb.append("낫싱");
            }else {
                if (ball > 0) {
                    sb.append(ball + "볼 ");
                }
                if (strike > 0) {
                    sb.append(strike + "스트라이크");
                }
            }
            return sb.toString();
        }
    }
    private Score score;

    public boolean judge(String answer, String userAnswer) {
        generateNowScore(answer, userAnswer);
        System.out.println(score);
        return isCorrectAnswer();
    }

    private void generateNowScore(String answer, String userAnswer) {
        score = new Score();
        for (int nowDigits = 0; nowDigits < ProblemProvider.DIGITS; nowDigits++) {
            checkNowDigits(answer, userAnswer, nowDigits);
        }
        checkNothing();
    }

    private void checkNowDigits(String answer, String userAnswer, int nowDigits) {
        boolean isStrike = checkStrike(answer, userAnswer, nowDigits);
        if (!isStrike) {
            checkBall(answer, userAnswer, nowDigits);
        }
    }

    private boolean checkStrike(String answer, String userAnswer, int nowDigits) {
        if (answer.charAt(nowDigits) == userAnswer.charAt(nowDigits)) {
            score.strike++;
            return true;
        } else {
            return false;
        }
    }

    private void checkBall(String answer, String userAnswer, int nowDigits) {
        if (answer.contains(String.valueOf(userAnswer.charAt(nowDigits)))) {
            score.ball++;
        }
    }

    private void checkNothing() {
        if (score.strike > 0 || score.ball > 0) {
            score.nothing = false;
        }else {
            score.nothing = true;
        }
    }

    private boolean isCorrectAnswer() {
        if (score.strike == ProblemProvider.DIGITS) {
            return true;
        }else {
            return false;
        }
    }
}
