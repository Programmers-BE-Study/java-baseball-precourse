package baseball;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    List<Integer> answerCom = new ArrayList<Integer>();
    public Computer() {
        answerCom.add(camp.nextstep.edu.missionutils.Randoms
                .pickNumberInRange(1,9));
        for(int i = 1; i <= 2; i++){
            answerCom.add(camp.nextstep.edu.missionutils.Randoms
            .pickNumberInRange(0,9));
        }
    }

    public List<Integer> getAnswerCom() {
        return answerCom;
    }
}
