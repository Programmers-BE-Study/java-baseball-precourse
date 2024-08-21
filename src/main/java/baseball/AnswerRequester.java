package baseball;
import camp.nextstep.edu.missionutils.Console;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class AnswerRequester {
    private InputInspector inputInspector = new InputInspector();
    public String requestUserAnswer() {
        System.out.println("숫자를 입력해주세요 : ");
        return inputInspector.inspectUserAnswerInput(readLine());
    }
}
