package duke.commands;

import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

public class ExitCommand extends Command {
    @Override
    public boolean isExit() {
        return true;
    }
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {

    }
}
