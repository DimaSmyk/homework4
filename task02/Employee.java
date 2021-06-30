package selfwork04.task02;



public class Employee {

    public String name;
    public String surname;
    private int salary;
    private int id;

    public int getId(){
        int count = 0;
        count++;
        id = count;
        return id;
    }


    public Employee(String name,String surname){
        this(name,surname,0);
    }

    public Employee(String name, String surname, int salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

}
