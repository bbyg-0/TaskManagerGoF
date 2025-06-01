import manager.TaskManagerFacade;
import task.Task;
import task.TaskFactory;
import task.ReminderDecorator;
import command.AddTaskCommand;
import command.NextStateCommand;

public class Main {
    public static void main(String[] args) {
        TaskManagerFacade facade = new TaskManagerFacade();

	// kalo mau tanpa command
	//facade.addNewTask("work", "Coding");

        Task task1 = TaskFactory.createTask("work", "Design Module");
        Task decoratedTask = new ReminderDecorator(task1);

        AddTaskCommand addCommand = new AddTaskCommand(decoratedTask);
	addCommand.execute();
        NextStateCommand addCommand2 = new NextStateCommand(decoratedTask);
	addCommand2.execute();

        facade.showAllTasks();
    }
}
