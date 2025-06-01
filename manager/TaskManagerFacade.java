package manager;

import task.Task;
import task.TaskFactory;

public class TaskManagerFacade {
    private final TaskManager manager = TaskManager.getInstance();

    public void addNewTask(String type, String name) {
        Task task = TaskFactory.createTask(type, name);
        manager.addTask(task);
    }
    public void nextStateTask(Task task) {
	manager.nextState(task);
    }

    public void showAllTasks() {
        manager.showTasks();
    }
}
