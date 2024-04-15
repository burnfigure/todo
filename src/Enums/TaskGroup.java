package Enums;

public enum TaskGroup implements Enum
{
    WORK(1),
    HOME(2),
    FAMILY(3),
    SOCIETY(4),
    LEARNING(5),
    NONE(6);

    private final int code;

    TaskGroup(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return this.code;
    }

    public static TaskGroup getByCode(int code)
    {
        for (TaskGroup taskGroup: TaskGroup.values()) {
            int taskGroupCode = taskGroup.getCode();

            if (taskGroupCode == code) {
                return taskGroup;
            }
        }

        return TaskGroup.NONE;
    }
}
