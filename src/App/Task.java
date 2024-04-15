package App;

import Enums.Status;
import Enums.TaskGroup;

import java.time.LocalDateTime;

public class Task {
    private int id;
    private String title;
    private String description;
    private Status status;
    private int priority;
    private TaskGroup group;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(String title, String description, Status status, TaskGroup group)
    {
        this.title = title;
        this.description = description;
        this.status = status;
        this.group = group;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public int getPriority()
    {
        return priority;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public TaskGroup getGroup()
    {
        return group;
    }

    public void setGroup(TaskGroup group)
    {
        this.group = group;
    }

}
