class Employee{

    private
    String name;
    int id;
    int salary;
    
    public
    Employee(String name, int id, int salary){

        this.name = name;
        this.id = id;
        this.salary=salary;
        display();
    }

    void display(){
        System.out.println("Name of the employee is " + name);
        System.out.println("ID of the employee is " + id);
        System.out.println("Salary of the employee is " + name);
    }
}

public class EmployeeMain{

    public static void main(String[] args) {

        String name = "Vardhman";
        int id = 120;
        int salary = 5000;

        Employee obj1 = new Employee(name, id, salary);

    }
}