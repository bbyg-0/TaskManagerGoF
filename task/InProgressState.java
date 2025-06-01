package task;

public class InProgressState implements TaskState {
    @Override
    public void handle(Task task) {
        System.out.println("Task '" + task.getTitle() + "' is now completed.");
        task.setState(new CompletedState());
    }

    @Override
    public String getStateName() {
        return "In Progress";
    }
}

