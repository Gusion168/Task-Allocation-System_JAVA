package taskAllocationSystem;

import java.util.List;
import java.util.ArrayList;

public class TeamMember {
    private String name;
    private List<String> skills;
    private List<String> assignedTasks;

    private static final int MAX_PROJECTS = 2;

    public TeamMember(String name, List<String> skills) {
        this.name = name;
        this.skills = new ArrayList<>(skills);
        this.assignedTasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public List<String> getAssignedTasks() {
        return assignedTasks;
    }

    public boolean canAssignMoreTasks() {
        return assignedTasks.size() < MAX_PROJECTS;
    }

    public void assignTask(String taskName) {
        assignedTasks.add(taskName);
    }
}
