package task;

public abstract class Task {
    protected String name;
    public Task(String name) { this.name = name; }
    public abstract String getDetails();

    public String getTitle(){return this.name;}

    private TaskState state = new PendingState(); // Default state saat dibuat

    public TaskState getState() {
        return state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public void advanceState() {
        state.handle(this); // Ganti state saat ini ke yang berikutnya
    }
}
