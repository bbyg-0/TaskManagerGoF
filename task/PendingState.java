package task;

public class PendingState implements TaskState {
    @Override
    public void handle(Task task) {
        System.out.println("Task '" + task.getTitle() + "' is now started.");
        task.setState(new InProgressState());
    }

    @Override
    public String getStateName() {
        return "Pending";
    }
}

