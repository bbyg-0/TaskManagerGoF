
package task;

public class PersonalTask extends Task {
    public PersonalTask(String name) { super(name); }
    public String getDetails() { return "Personal: " + name; }
}
