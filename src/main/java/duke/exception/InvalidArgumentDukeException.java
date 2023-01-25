package duke.exception;

public class InvalidArgumentDukeException extends DukeException {
    private static final String ERROR_MESSAGE = "Invalid argument!";

    public InvalidArgumentDukeException() {
        super(ERROR_MESSAGE);
    }
}
