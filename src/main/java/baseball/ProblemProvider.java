package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class ProblemProvider {
    private static final int DIGITS = 3;
    public String generateAnswer() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < DIGITS; i++) {
            sb.append(Randoms.pickNumberInRange(1, 9));
        }
        return sb.toString();
    }
}
