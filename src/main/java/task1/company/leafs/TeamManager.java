package task1.company.leafs;

import task1.company.enums.Position;
import task1.company.enums.Role;
import task1.company.interfaces.ManagerInter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeamManager extends Employee implements ManagerInter {

    private List<Employee> listEmployee = new ArrayList<>();

    public TeamManager(String name, Role role) {
        super(name, role, Position.Manager);
        this.addTask(new Task("Zapoznaj się z polityką bezpieczeńśtwa"));
    }

    @Override
    public void hire(Employee employee) {

        listEmployee.add(employee);

    }

    @Override
    public void fire(Employee employeeFired) {

        if (employeeFired.getPosition().equals(Position.Manager)) {

            for (Employee e : listEmployee) {
                if (!e.equals(employeeFired)) {
                    e.setBoss(this);

                }

            }

        }
        listEmployee.remove(employeeFired);

    }

    @Override
    public boolean canHire() {
        return super.canHire;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void assignTask(Task task, Employee employee) {
        task.setAssignDate(LocalDate.now());
        task.setAssignedEmployee(employee);
        employee.addTask(task);

    }

    public void reportTeamWork() {
        int tasksInProgress = 0;
        int tasksToDo = 0;
        int tasksDone = 0;

        for (Employee e : listEmployee) {
            for (Task t : e.getTaskList()) {
                if (t.isDone()) tasksDone++;
                if (t.getProgress() == 0) tasksToDo++;
                if (t.getProgress() > 0) tasksInProgress++;
            }


        }

        System.out.println("------TEAM TASKS RAPORT-------");
        System.out.println("tasks done " + tasksDone);
        System.out.println("todo " + tasksToDo);
        System.out.println("inprogress " + tasksInProgress);


    }

}
