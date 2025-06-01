package task;

public interface TaskState {
    void handle(Task task);
    String getStateName();
    void advanceState(Task task);
}
