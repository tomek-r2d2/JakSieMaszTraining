package task1.company.leafs;

import task1.company.enums.Position;
import task1.company.enums.Role;

public class Developer extends Employee {


    public Developer(String name,  Role role) {
        super(name, role, Position.Developer);
        this.addTask(new Task("Zapoznaj się z polityką prywatoności"));


    }
}
