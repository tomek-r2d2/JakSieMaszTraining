package task0.jarbuilder;


import java.util.Comparator;

public class Person {

    private String name;
    private String surname;
    private String email;


    public Person(String name, String surname, String email) {
        setName(name);
        setSurname(surname);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (testData(name, "^[a-zA-Z]+")) {
            this.name = name;
        } else {
            this.name = "";
        }


    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (testData(surname, "^[a-zA-Z]+")) {
            this.surname = surname;
        } else {
            this.surname = "";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String ptr = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})";
        //https://stackoverflow.com/questions/8204680/java-regex-email
        if (testData(email, ptr)) {
            this.email = email;
        } else {
            this.email = "";
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    boolean testData(String input, String regex) {
        return input.matches(regex);
    }

}
