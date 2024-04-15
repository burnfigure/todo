import App.Storage;
import App.Task;
import Enums.Status;
import Helpers.Json;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Storage storage = new Storage();
        Task task = storage.createTask();
        storage.addTask(task);

        Task task1 = storage.createTask();
        storage.addTask(task1);

        String prettyJson = Json.pretty(storage.getTasks());
        System.out.println(prettyJson);

        //String json = Json.string(task1);
        //System.out.println(json);

        //System.out.println(Json.string(Status.getStatusByCode(6666)));

    }
}
