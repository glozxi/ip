package duke;

import duke.commands.Command;
import duke.exception.DukeException;
import duke.parser.Parser;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;
import javafx.application.Platform;

/**
 * Represents a Duke chatbot that stores a tasklist.
 */
public class Duke {

    private static TaskList taskList = new TaskList();
    private static Parser parser = new Parser();
    private static Storage storage;
    private static Ui ui = new Ui();

    public Duke() {

    }

    /**
     * Constructor.
     * @param filePath Path of the file where task data is stored.
     */
    public Duke(String filePath) throws DukeException {
        storage = new Storage(filePath);
        taskList = storage.load(parser);
    }

    private String acceptOneCommand(String input) {
        try {
            Command command = parser.parseCommand(input);
            if (command.isExit()) {
                Platform.exit();
            } else {
                return command.execute(taskList, ui, storage);
            }
            storage.save(taskList);
            return null;
        } catch (DukeException e) {
            return e.toString();
        }
    }

    /**
     * You should have your own function to generate a response to user input.
     * Replace this stub with your completed method.
     */
    public String getResponse(String input) {
        return acceptOneCommand(input);
    }

}
