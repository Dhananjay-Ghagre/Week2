import java.util.ArrayList;
class Company {//Company class
    private String name; //name of the company
    private ArrayList<Department> departments;
    Company(String name){
        this.name=name; 
        departments=new ArrayList<>();
    }
    public String getname(){//getname method
        return name; 
    }
    public void addDepartment(Department d){//addDepartment method
        departments.add(d);
    }
    public void deleteCompany(){//deleteCompany method
        for(Department d:departments){
            d.deleteDepartment();
        }
    }



    
}
class Department{//Department class
    private String name; 
    private ArrayList<Employee> employees;
    Department(String name){
        this.name=name; 
        employees=new ArrayList<>();
    }
    public String getname(){
        return name; 
    }
    public void addEmployee(Employee e){
        employees.add(e);
    }
    public void deleteDepartment(){
        for(Employee e:employees){
            e.deleteEmployee();
        }
    }
} 
class Employee{//Employee class
    private String name; 
    Employee(String name){//Employee constructor
        this.name=name; 
    }
    public String getname(){//getname method
        return name; 
    }
    public void deleteEmployee(){
        System.out.println("Employee "+name+" is deleted");
    }
}
public class CompanyMain{
    public static void main(String[] args) { //main method
        Company c=new Company("Google");
        Department d1=new Department("HR");
        Department d2=new Department("IT");
        Employee e1=new Employee("Nishant");
        Employee e2=new Employee("Rahul");
        Employee e3=new Employee("Rohit");
        Employee e4=new Employee("Raj");
        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d2.addEmployee(e3);
        d2.addEmployee(e4);
        c.addDepartment(d1);
        c.addDepartment(d2);
        c.deleteCompany();
    }
}
/*
 * Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.

 */