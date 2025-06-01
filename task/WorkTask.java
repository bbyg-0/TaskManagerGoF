
package task;

public class WorkTask extends Task {
    public WorkTask(String name) { super(name); }
    public String getDetails() { return "Work: " + name; }
}
