package command;

import task.Task;
import manager.TaskManager;

public class AddTaskCommand implements Command {
    private final Task task;

    public AddTaskCommand(Task task) {
        this.task = task;
    }

    public void execute() {
        TaskManager.getInstance().addTask(task);
    }
}
