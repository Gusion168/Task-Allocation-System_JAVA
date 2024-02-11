package taskAllocationSystem;

public class Task {
    private String id;
    private String description;
    private int priority;
    private String projectName;
    private String deadLine;
    private boolean isFrontEnd;

    public Task(String id, String description, int priority, String projectName, String deadLine, boolean isFrontEnd) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.projectName = projectName;
        this.isFrontEnd = isFrontEnd;
        this.deadLine = deadLine;
    }

    public String id() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getProjectName() {
        return projectName;
    }

    public boolean isFrontEnd() {
        return isFrontEnd;
    }

    public String getDeadLine() {
        return deadLine;
    }
}

