package selfwork04.task02;

public class Manager extends  Employee {

    int count2 = 0;

    public Manager(String name, String surname) {
        super(name,surname);
    }

    public Manager(String name, String surname, int salary){
        super(name,surname,salary);
    }

    int[] subordinates = new int[2];

    public void addId (int id) {
        subordinates [count2] = id;
        count2++;
    }
}



