package Enums;

public enum Status implements Enum
{
    ACTIVE(1),
    DRAFT(2),
    DONE(3),
    PAUSED(4),
    CANCELED(5),
    NONE(6);

    private final int code;

    Status(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return this.code;
    }

    public static Status getByCode(int code)
    {
        for (Status status: Status.values()) {
            int statusCode = status.getCode();

            if (statusCode == code) {
                return status;
            }
        }

        return Status.NONE;
    }
}
