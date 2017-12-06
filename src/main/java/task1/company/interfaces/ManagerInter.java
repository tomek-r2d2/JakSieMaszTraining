package task1.company.interfaces;

import task1.company.leafs.Employee;

public interface ManagerInter extends EmployeeInter {

    public void hire (Employee employee);
    public void fire (Employee employee);
    public boolean canHire();


}
