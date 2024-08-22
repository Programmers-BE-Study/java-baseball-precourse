package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class AnswerRequester {
    private InputInspector inputInspector = new InputInspector();
    public String requestUserAnswer() {
        System.out.print("숫자를 입력해주세요 : ");
        return inputInspector.inspectUserAnswerInput(readLine());
    }
}
