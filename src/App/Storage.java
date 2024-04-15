package App;

import Factories.TaskFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Storage
{
    private final ArrayList<Task> tasks;
    private final Scanner scanner;
    private final TaskFactory taskFactory;

    public Storage()
    {
        this.tasks = new ArrayList<Task>();
        this.scanner = new Scanner(System.in);
        this.taskFactory = new TaskFactory(this.scanner);
    }

    public Task createTask()
    {
        return this.taskFactory.createTask(this);
    }

    public void addTask(Task task)
    {
        this.tasks.add(task);
    }

    public ArrayList<Task> getTasks()
    {
        return this.tasks;
    }
}
