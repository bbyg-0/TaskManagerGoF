package task;

public class ReminderDecorator extends TaskDecorator {
    public ReminderDecorator(Task task) {
        super(task);
    }

    public String getDetails() {
        return task.getDetails() + " [" + task.getState().getStateName() + "]";
    }
    @Override
    public void advanceState() {
        task.advanceState();
    }
}
