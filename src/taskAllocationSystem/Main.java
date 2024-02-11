package taskAllocationSystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example usage of the Task Allocation System
        TeamMember member1 = new TeamMember("Seavlong", List.of("Front End", "Flutter"));
        TeamMember member2 = new TeamMember("Thavath", List.of("Back End", "Web"));
        TeamMember member3 = new TeamMember("Yeng", List.of("Front End", "Web"));
        TeamMember member4 = new TeamMember("Reaksmey", List.of("Front End","Figma"));

        Task task1 = new Task("001", "Implement user login functionality", 2, "ProjectA","1-02-24", true);
        Task task2 = new Task("002","Make a homepage by using flutter",2,"Weather MobileApp","2-02-24",true);
        Task task3 = new Task("003","Design database for web",1,"WebsiteA","3-02-24",false);
        Task task4 = new Task("004","Design database for Mobile",1,"Weather MobileApp","4-02-24",false);
        Task task5 = new Task("005","Design database for WebApp",2,"WebAppA","5-02-24",false);


        TaskAllocationSystem taskSystem = new TaskAllocationSystem();

        taskSystem.addTeamMember(member1);
        taskSystem.addTeamMember(member2);
        taskSystem.addTeamMember(member3);
        taskSystem.addTeamMember(member4);

        taskSystem.addTask(task1);
        taskSystem.addTask(task2);
        taskSystem.addTask(task3);
        taskSystem.addTask(task4);
        taskSystem.addTask(task5);

        taskSystem.manuallyAssignTasks();


        System.out.println("=========================================");
        System.out.println("                Team Members              ");
        System.out.println("=========================================");
        System.out.println("________________________________");
        taskSystem.displayTeamMembers();

        System.out.println("=========================================");
        System.out.println("                  Tasks                  ");
        System.out.println("=========================================");
        taskSystem.displayTasks();
    }
}

