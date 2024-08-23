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

    public boolean judge(String answer, String userAnswer) {
        Score score = makeScore(answer, userAnswer);
        System.out.println(score);
        return isCorrectAnswer(score);
    }

    private Score makeScore(String answer, String userAnswer) {
        Score score = new Score();
        for (int nowDigits = 0; nowDigits < ProblemProvider.DIGITS; nowDigits++) {
            if (isStrike(answer, userAnswer, nowDigits)) {
                score.strike++;
                continue;
            }
            if (isBall(answer, userAnswer, nowDigits)) {
                score.ball++;
                continue;
            }
        }
        if (isNothing(score)) {
            score.nothing = true;
        }
        return score;
    }
    private boolean isStrike(String answer, String userAnswer, int nowDigits) {
        if (answer.charAt(nowDigits) == userAnswer.charAt(nowDigits)){
            return true;
        }
        return false;
    }
    private boolean isBall(String answer, String userAnswer, int nowDigits) {
        if (answer.contains(String.valueOf(userAnswer.charAt(nowDigits)))){
            return true;
        }
        return false;
    }
    private boolean isNothing(Score score) {
        if (score.strike > 0 || score.ball > 0) {
            return false;
        }
        return true;
    }
    private boolean isCorrectAnswer(Score score) {
        if (score.strike == ProblemProvider.DIGITS) {
            return true;
        }else {
            return false;
        }
    }
}
