package selfwork04.task02;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Manager man1 = new Manager("Petya","Pupkin");
        Manager man2 = new Manager("Misha","Ivanov");

        Employee emp1 = new Employee("Vasya","Vasin",100);
        Employee emp2 = new Employee("Tolik","Kakoito");
        Employee emp3 = new Employee("Fedya","Fedin");

        man1.addId(emp1.getId());
        man1.addId(emp2.getId());
        man2.addId(emp3.getId());

        System.out.println("Worker №." + emp1.getId() + " " + emp1.name + " " +  emp1.surname);
        System.out.println("Worker №." + emp2.getId() + " " + emp2.name + " " +  emp2.surname);
        System.out.println("Worker №." + emp3.getId() + " " + emp3.name + " " +  emp3.surname);

        System.out.println( "Работники первого менеджера: " + Arrays.toString(man1.subordinates));
        System.out.println( "Работники второго менеджера: " + Arrays.toString(man2.subordinates));

    }
}
