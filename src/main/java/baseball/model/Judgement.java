package baseball.model;


public enum Judgement {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String judgement;
    Judgement(String judgement){
        this.judgement = judgement;
    }

    public String toString() {
        return this.judgement;
    }

    public static Judgement judge(boolean isStrike, boolean isBall) {
        if(isStrike) {
            return STRIKE;
        }

        if (isBall) {
            return BALL;
        }

        return NOTHING;
    }
}
