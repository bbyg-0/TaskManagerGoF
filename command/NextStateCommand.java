package command;

import task.Task;
import manager.TaskManager;

public class NextStateCommand implements Command {
    private final Task task;

    public NextStateCommand(Task task) {
        this.task = task;
    }

    public void execute() {
        task.advanceState();
    }
}
