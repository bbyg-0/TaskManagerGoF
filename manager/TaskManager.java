package manager;

import task.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static TaskManager instance = null;
    private List<Task> tasks = new ArrayList<>();

    private TaskManager() {}

    public static TaskManager getInstance() {
        if (instance == null) instance = new TaskManager();
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    /*
    public void nextState(Task task) {
	for (Task task1 : tasks) {
            if (task1.getTitle().equalsIgnoreCase(task.getTitle())) {
			System.out.println("asd");
		    task1.getState().advanceState();
		    return;
            }
        }
    }
*/
    public void showTasks() {
        for (Task task : tasks) {
            System.out.println(task.getDetails());
        }
    }
}
