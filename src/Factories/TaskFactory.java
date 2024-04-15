package Factories;

import App.Storage;
import App.Task;
import Enums.Status;
import Enums.TaskGroup;

import java.util.Scanner;

public class TaskFactory
{
    private final Scanner scanner;

    public TaskFactory(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public Task createTask(Storage storage)
    {
        int taskId = this.getTaskId(storage);

        System.out.printf("Задача %d. Введите короткое описание задания: \n", taskId);
        String title = this.scanner.nextLine();

        System.out.printf("Задача %d. Введите полное описание задания: \n", taskId);
        String description = this.scanner.nextLine();

        System.out.printf("Задача %d. Установите статус записи: \n", taskId);
        this.printStatusesMessage();
        int statusCode = this.scanner.nextInt();
        Status status = Status.getByCode(statusCode);

        System.out.printf("Задача %d. Установите группу записи: \n", taskId);
        this.printTaskGroupMessage();
        int taskGroupCode = this.scanner.nextInt();
        TaskGroup taskGroup = TaskGroup.getByCode(taskGroupCode);

        Task task = new Task(
            title,
            description,
            status,
            taskGroup //обобщить через индерфейс со статусами
        );

        task.setId(this.getTaskId(storage));
        task.setPriority(this.getPriority(storage));

        return task;
    }

    private void printTaskGroupMessage()
    {
        for (TaskGroup taskGroup: TaskGroup.values()) {
            int code = taskGroup.getCode();
            System.out.printf("%d. %s \n", code, TaskGroup.getByCode(code).toString());
        }
    }

    private void printStatusesMessage()
    {
        for (Status status: Status.values()) {
            int code = status.getCode();
            System.out.printf("%d. %s \n", code, Status.getByCode(code).toString());
        }
    }

    private int getTaskId(Storage storage)
    {
        int lastIndex = 0;

        for (Task task : storage.getTasks()) {
            int id = task.getId();

            if (id > lastIndex) {
                lastIndex = id;
            }
        }

        return lastIndex + 1;
    }

    private int getPriority(Storage storage)
    {
        int lastPriority = 0;

        for (Task task : storage.getTasks()) {
            int id = task.getPriority();

            if (id > lastPriority) {
                lastPriority = id;
            }
        }

        return lastPriority + 1;
    }
}
