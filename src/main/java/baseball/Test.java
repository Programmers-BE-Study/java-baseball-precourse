package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        // 첫번째 자리 수 저장
        List<Integer> answerCom = camp.nextstep.
                edu.missionutils.Randoms.pickUniqueNumbersInRange(1,9,1);
        System.out.println(answerCom);
        answerCom.add(Randoms.pickNumberInRange(0,9));
        answerCom.add(Randoms.pickNumberInRange(0,9));

        for(int i : answerCom) System.out.println(i);

        while(true) {
            break;
           // String answerUser = camp.nextstep.edu.missionutils.Console.readLine();
        }
    }
}
