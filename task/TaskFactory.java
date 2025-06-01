package task;

public class TaskFactory {
    public static Task createTask(String type, String name) {
        return switch (type) {
            case "work" -> new WorkTask(name);
            case "personal" -> new PersonalTask(name);
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
