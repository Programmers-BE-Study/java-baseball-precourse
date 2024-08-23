package baseball;

import java.io.IOException;
import java.text.ParseException;

public class InputInspector {
    public String inspectUserAnswerInput(String input) {
        //1. 0이 들어가있는지
        //2. 자릿수가 맞는지
        //3. 숫자인지
        if (input.contains("0")) {
            throw new IllegalArgumentException();
        }
        if (ProblemProvider.DIGITS != input.length()) {
            throw new IllegalArgumentException();
        }
        try {
            int intValue = Integer.parseInt(input);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public String inspectRestartInput(String input) throws IllegalArgumentException{
        if (input.equals("1") || input.equals("2")) {
            return input;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
