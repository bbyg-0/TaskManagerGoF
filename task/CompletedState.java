package task;

public class CompletedState implements TaskState {
    @Override
    public void handle(Task task) {
        System.out.println("Task '" + task.getTitle() + "' is already completed. No changes allowed.");
    }

    @Override
    public String getStateName() {
        return "Completed";
    }
}

