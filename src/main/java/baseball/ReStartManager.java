package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class ReStartManager {
    private InputInspector inputInspector = new InputInspector();
    private boolean reStart;

    public void askReStart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String reStartReply = inputInspector.inspectRestartInput(readLine());
        reStart = readReStartReply(reStartReply);
    }
    private boolean readReStartReply(String reStartReply) {
        if (reStartReply.equals("1")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkReStart() {
        return reStart;
    }
}
