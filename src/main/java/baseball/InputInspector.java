package baseball;


public class InputInspector {
    public String inspectUserAnswerInput(String input) {
        checkContainsZero(input);
        checkEqualsDigits(input);
        checkIsNumber(input);
        return input;
    }

    private void checkContainsZero(String input) {
        if (input.contains("0")) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkEqualsDigits(String input) {
        if (ProblemProvider.DIGITS != input.length()) {
            throw new IllegalArgumentException();
        }
    }

    private void checkIsNumber(String input) {
        try {
            int intValue = Integer.parseInt(input);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public String inspectRestartInput(String input) throws IllegalArgumentException{
        if (input.equals("1") || input.equals("2")) {
            return input;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
