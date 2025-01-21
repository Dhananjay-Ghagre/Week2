



public class HospitalManagment {
    String hospitalName;
    String patientName;  
    int age; 
    String ailment; 
    final String patientID; 
    int totalnoofPatient=0;
    HospitalManagment(String hospitalName,String patientName,int age,String ailment,String patientID)
    {
        this.hospitalName=hospitalName; 
        this.patientName=patientName;
        this.age=age; 
        this.ailment=ailment; 
        this.patientID=patientID;
        totalnoofPatient++;

    } 
    public int totalCount(){
        return totalnoofPatient;
    }
    public void display(){
        if(this instanceof HospitalManagment){
            System.out.println("The name of the Hospital is "+hospitalName);
            System.out.println("THe name of the Patient is "+patientName);
            System.out.println("THe age of the Patient is "+age); 
            System.out.println("The aligment given to the patient is "+ailment); 
            System.out.println("The id ot the Patient is "+patientID);
            System.out.println("The total no of the Patient is "+totalCount());
        }
    }
    public static void main(String[] args) {
       
        HospitalManagment hm=new HospitalManagment("Bansal Hospital", "Pankj", 22, "Pasta", "BS20233");
       
        hm.display();

        
    }







    
}
/*
 * Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.

 */
