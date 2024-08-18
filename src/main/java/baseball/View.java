package baseball;

import camp.nextstep.edu.missionutils.Console;

public class View {
    static void startView(){
        User user = null;
        while(true){
            System.out.println("숫자를 입력해주세요 : ");
            user.setAnswerUser(Integer.parseInt(Console.readLine()));

        }
    }
}
