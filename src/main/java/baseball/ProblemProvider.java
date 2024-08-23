package baseball;

import camp.nextstep.edu.missionutils.Randoms;


public class ProblemProvider {
    public static final int DIGITS = 3;

    public String generateAnswer() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < DIGITS; i++) {
            sb.append(generateNotDuplicatedNumber(sb.toString()));
        }
        return sb.toString();
    }

    private int generateNotDuplicatedNumber(String madeNumber) {
        while (true) {
            int n = Randoms.pickNumberInRange(1, 9);
            if (isDuplicated(madeNumber, n)) continue;
            return n;
        }
    }

    private static boolean isDuplicated(String madeNumber, int n) {
        return madeNumber.contains(String.valueOf(n));
    }
}
