package taskAllocationSystem;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TaskAllocationSystem {
    private List<TeamMember> teamMembers;
    private List<Task> tasks;

    public TaskAllocationSystem() {
        this.teamMembers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addTeamMember(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void manuallyAssignTasks() {
        Scanner scanner = new Scanner(System.in);

        for (Task task : tasks) {
            System.out.println("=========================");
            System.out.println("Task Id: " + task.id());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Priority: " + task.getPriority());
            System.out.println("Project: " + task.getProjectName());
            System.out.println("Is Front End: " + task.isFrontEnd());

            System.out.println("Available Team Members:");
            displayAvailableTeamMembers(task.isFrontEnd());

            System.out.print("Enter the name of the team member to assign the task (or 'skip' to skip): ");
            String teamMemberName = scanner.nextLine();

            if (!teamMemberName.equalsIgnoreCase("skip")) {
                TeamMember selectedTeamMember = findTeamMemberByName(teamMemberName);
                if (selectedTeamMember != null && selectedTeamMember.canAssignMoreTasks()) {
                    selectedTeamMember.assignTask(task.id());
                    System.out.println("Task assigned to " + teamMemberName);
                } else {
                    System.out.println("Invalid assignment. Task not assigned.");
                }
            }
        }
    }

    private void displayAvailableTeamMembers(boolean isFrontEnd) {
        for (TeamMember teamMember : teamMembers) {
            if (teamMember.canAssignMoreTasks() && teamMember.getSkills().contains(isFrontEnd ? "Front End" : "Back End")) {
                System.out.println(" - " + teamMember.getName());
            }
        }
    }

    private TeamMember findTeamMemberByName(String name) {
        for (TeamMember teamMember : teamMembers) {
            if (teamMember.getName().equalsIgnoreCase(name)) {
                return teamMember;
            }
        }
        return null;
    }

    public void displayTeamMembers() {
        for (TeamMember teamMember : teamMembers) {
            System.out.println("Team Member: " + teamMember.getName());
            System.out.println("Skills: " + teamMember.getSkills());
            System.out.println("Assigned Tasks: " + teamMember.getAssignedTasks());
            System.out.println("________________________________");
        }
    }



    public void displayTasks() {
        for (Task task : tasks) {


            System.out.println("Task Id: " + task.id());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Priority: " + task.getPriority());
            System.out.println("Project: " + task.getProjectName());
            System.out.println("Is Front End: " + task.isFrontEnd());
            System.out.println("DeadLine: " + task.getDeadLine());
            System.out.println("------");
        }
    }
}
