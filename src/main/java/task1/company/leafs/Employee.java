package task1.company.leafs;

import task1.company.enums.Position;
import task1.company.enums.Role;
import task1.company.interfaces.EmployeeInter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Employee implements EmployeeInter {

    private Role role;
    private Position position;
    boolean canHire;
    private String name;
    private Employee boss;
    private List <Task> taskList;

    public boolean isCanHire() {
        return canHire;
    }

    public void setCaHire(boolean caHire) {
        this.canHire = caHire;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public Employee(String name, Role role, Position position ) {
        this.role = role;
        this.position = position;
        this.name = name;
        this.boss = null;

        this.taskList = new ArrayList<>();
        this.canHire = position.equals(Position.Manager);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

public void addTask(Task task)
{
    this.taskList.add(task);
}

public void reportTasks()
{
    System.out.println("DESCRIPTION ----- CREATED TIME -- ASSIGN DATE -- FINISH DATE - CODE REVIEW -- IS DONE");

    for(Task t:taskList)
    {
        System.out.println(" "+
        t.getDesc()+" --"+
        t.getCreatedDate()+" --"+
        t.getAssignDate()+" --"+
        t.getFinishedDate()+" --"+
        t.isCodeReviewed()+" --"+
        t.isDone()+" --");
    }

}

    @Override
    public String toString() {
        return "Employee{" +
                "role=" + role +
                ", position=" + position +
                ", name='" + name + '\'' +
                ", boss=" + boss +
                '}';
    }
}
