package task0.jarbuilder;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.RandomStringUtils;
import task0.jarbuilder.comparators.EmailComparator;
import task0.jarbuilder.comparators.NameComparator;
import task0.jarbuilder.comparators.SurnameComparator;

public class Generator {


    private int amount;

    public Generator(int amount) {
        this.amount = amount;
    }

    private ArrayList<Person> listPersons = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private String randomName() {
        return "";

    }

    public void generate() {
        for (int i = 0; i < this.getAmount(); i++) {

            RandomStringUtils rsu = new RandomStringUtils();

            String rd1 = rsu.random(8, true, false);
            String rd2 = rsu.random(9, true, false);
            // String rd3 = new RandomStringUtils.random(8); dlaczego zle

            StringBuilder sb = new StringBuilder(rsu.random(9, true, false));
            sb.append("@").append(rsu.random(10, true, false)).append(".").append(rsu.random(2, true, false));

            String rd3 = sb.toString();

            listPersons.add(new Person(rd1, rd2, rd3));

        }


    }

    public void printCollection(ArrayList<Person> list) {
        for (Person p : list) {
            System.out.println(p.toString());
        }
    }


    public void print() {
        System.out.println("---------------BY NAME-------------------------------");
        Collections.sort(listPersons, new NameComparator());
        printCollection(listPersons);
        System.out.println("---------------BY SURNAME-------------------------------");
        Collections.sort(listPersons, new SurnameComparator());
        printCollection(listPersons);
        System.out.println("---------------BY EMAIL-------------------------------");
        Collections.sort(listPersons, new EmailComparator());
        printCollection(listPersons);
    }


}

