public class EmployeeManagment { //EmployeeManagment class
    private String name; //instance variable
    private  final int id; 
    private String designation; 

    public EmployeeManagment(String name,int id,String designation) {//EmployeeManagment constructor
        this.name=name; //this keyword is used to refer the instance variable
        this.id=id; //this keyword is used to refer the instance variable
        this.designation=designation;//this keyword is used to refer the instance variable
    }
    public void displayDetail(){//displayDetail method for displaying the details of the Employee
        if(this instanceof EmployeeManagment){
            System.out.println("The name of the Employee is "+name);
            System.out.println("The id of the Employee is "+id); 
            System.out.println("The Designation of the Employee is "+designation);
        }
    } 
    public static void main(String[] args) { //main method for testing
        EmployeeManagment e=new EmployeeManagment("Nishant", 210, "Backend Developer"); //creating object of EmployeeManagment class
        EmployeeManagment e2=new EmployeeManagment("Pankaj ", 2131, "DevOps Engineer"); //creating object of EmployeeManagment class
        EmployeeManagment e3=new EmployeeManagment("Saurabh", 2020, "Kubernetes Administrator"); //creating object of EmployeeManagment class
        e.displayDetail();
        e2.displayDetail(); 
        e3.displayDetail();
        
    }
    

    
}
/*
 * 
 * Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.

 * 
 */
