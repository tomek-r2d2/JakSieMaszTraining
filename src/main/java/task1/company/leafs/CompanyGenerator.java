package task1.company.leafs;

import task1.company.Utils.SampleData;
import task1.company.Utils.TextGenerator;
import task1.company.enums.Role;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CompanyGenerator {


    private int level;
    private Random random;
    private TextGenerator textGenerator;
    private ArrayList<Employee> managerList;
    private ArrayList<Employee> devList;


    public CompanyGenerator(int level) {
        this.level = level;
        this.textGenerator = new TextGenerator();
        this.managerList = new ArrayList<>();
        this.devList = new ArrayList<>();
    }


    public void generate() {

        String name;
        String taskName;

        for (int i = 0; i < level; i++) {
            name = textGenerator.generateName();

            managerList.add(new TeamManager(name, Role.randomRole()));

            //set up boss for current
            if (i != 0) {
                managerList.get(i).setBoss(managerList.get(i - 1));
            }


            int randomNum = ThreadLocalRandom.current().nextInt(1, 15 + 1);
            for (int j = 0; j < randomNum; j++) {
                name = textGenerator.generateName();
                taskName = textGenerator.generateTask();
                Task task1 = new Task(taskName);

                Developer developer = new Developer(name, Role.randomRole());
                developer.setBoss(managerList.get(i));
                developer.addTask(task1);

                devList.add(developer);
            }


        }


    }

    public void display() {

        System.out.println("==DEV==");

        for (Employee employee : devList) {
            employee.toString();
            employee.reportTasks();
        }
        System.out.println("==MANAGER==");

        for (Employee employee :
                managerList) {
            employee.toString();
            employee.reportTasks();
        }

    }


}
