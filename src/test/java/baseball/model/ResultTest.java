package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ResultTest {

    @Test
    @DisplayName("낫싱")
    void nothing() {
        // Given: a result object
        Result result = new Result();

        result.setResultByJudgement(Judgement.NOTHING);

        assertEquals(0, result.getBallCount());
        assertEquals(0, result.getStrikeCount());
    }

    @Test
    @DisplayName("1 스트라이크")
    void oneStrike() {
        // Given: a result object
        Result result = new Result();

        result.setResultByJudgement(Judgement.STRIKE);

        assertEquals(0, result.getBallCount());
        assertEquals(1, result.getStrikeCount());
    }

    @Test
    @DisplayName("2 스트라이크")
    void twoStrike() {
        // Given: a result object
        Result result = new Result();

        result.setResultByJudgement(Judgement.STRIKE);
        result.setResultByJudgement(Judgement.STRIKE);

        assertEquals(0, result.getBallCount());
        assertEquals(2, result.getStrikeCount());
    }

    @Test
    @DisplayName("3 스트라이크")
    void threeStrike() {
        // Given: a result object
        Result result = new Result();

        result.setResultByJudgement(Judgement.STRIKE);
        result.setResultByJudgement(Judgement.STRIKE);
        result.setResultByJudgement(Judgement.STRIKE);

        assertEquals(0, result.getBallCount());
        assertEquals(3, result.getStrikeCount());
    }

    @Test
    @DisplayName("1볼")
    void oneBall() {
        Result result = new Result();

        result.setResultByJudgement(Judgement.BALL);

        assertEquals(1, result.getBallCount());
        assertEquals(0, result.getStrikeCount());
    }

    @Test
    @DisplayName("2볼")
    void twoBall() {
        Result result = new Result();

        result.setResultByJudgement(Judgement.BALL);
        result.setResultByJudgement(Judgement.BALL);

        assertEquals(2, result.getBallCount());
        assertEquals(0, result.getStrikeCount());
    }


    @Test
    @DisplayName("3볼")
    void threeBall() {
        Result result = new Result();

        result.setResultByJudgement(Judgement.BALL);
        result.setResultByJudgement(Judgement.BALL);
        result.setResultByJudgement(Judgement.BALL);

        assertEquals(3, result.getBallCount());
        assertEquals(0, result.getStrikeCount());
    }
}
