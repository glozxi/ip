package duke.uiText;

/**
 * Class that deals with interactions with the user.
 */
public class UiText {

    /**
     * Prints a greeting.
     */
    public String getGreeting() {
        return "Hello, I am Duke.\n"
                + "What can I do for you?";
    }

    /**
     * Prints a goodbye.
     */
    public String sayGoodbye() {
        return "Goodbye. I hope to see you again.";
    }
}
