package task1.company.leafs;

import task1.company.enums.Position;
import task1.company.enums.Role;
import task1.company.leafs.Developer;
import task1.company.leafs.Employee;
import task1.company.leafs.Task;
import task1.company.leafs.TeamManager;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        CompanyGenerator companyGenerator = new CompanyGenerator(5);
        companyGenerator.generate();
        companyGenerator.display();

  /*      Task t1 = new Task("Zakup licenicji na INtelIJ");
        Task t2 = new Task("poprakwa Menu");
        Task t3 = new Task("Rozpoznanie dostpnych bibilotek pod implementację #1234");

        TeamManager miroslaw = new TeamManager("Miroslaw", Role.CEO);

        TeamManager janek = new TeamManager("Janek", Role.TeamManager);
        janek.setBoss(miroslaw);

        TeamManager zbyszek = new TeamManager("Zbyszek", Role.TeamLeader);
        zbyszek.setBoss(janek);

        Developer tomek = new Developer("Tomek", Role.JuniorDev);
        tomek.setBoss(zbyszek);

        Developer eryk = new Developer("Eryk", Role.MidDev);
        eryk.setBoss(janek);
        eryk.addTask(t2);
        eryk.addTask(t1);

        Employee mietek = new Developer("Mietek", Role.JuniorDev);
        mietek.setBoss(janek);
        mietek.addTask(t3);

        mietek.reportTasks();

        janek.reportTeamWork();*/
    }

}
