
package task;

public abstract class TaskDecorator extends Task {
    protected Task task;
    public TaskDecorator(Task task) {
        super(task.name);
        this.task = task;
    }
}
