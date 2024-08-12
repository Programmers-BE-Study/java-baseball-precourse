package baseball.utils.constant;

public enum Command {

    RESTART("1"),
    EXIT("2");

    private final String command;

    Command(String command) {
        this.command = command;
    }

    public String toString() {
        return command;
    }

    public static Command getCommand(String input) {
        for (Command command : values()) {
            if(input.equals(command.toString())) {
                return command;
            }
        }
        return null;
    }
}
