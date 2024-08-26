package baseball.model;

import baseball.utils.constant.Numbers;

public class Result {
    private int strikeCount;
    private int ballCount;

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setResultByJudgement(Judgement judgement) {
        if(judgement.equals(Judgement.STRIKE)) {
            strikeCount++;
        }

        if(judgement.equals(Judgement.BALL)) {
            ballCount++;
        }
    }

    @Override
    public String toString() {
        if(strikeCount == Numbers.ZERO.getNumber() && ballCount == Numbers.ZERO.getNumber()) {
            return Judgement.NOTHING.toString();
        }

        StringBuilder sb = new StringBuilder();

        if(ballCount != Numbers.ZERO.getNumber()) {
            sb.append(ballCount)
                    .append(Judgement.BALL)
                    .append(" ");
        }

        if(strikeCount != Numbers.ZERO.getNumber()) {
            sb.append(strikeCount)
                    .append(Judgement.STRIKE);

        }

        return sb.toString().trim();
    }
}
