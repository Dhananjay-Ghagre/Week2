public class UniversityManagment {
    static String universityName;
   final String rollNumber;
    char Grade; 
   static int totalnoOfStudent=0; 

    public UniversityManagment(String universityName,String rollNumber,char Grade) {
        this.universityName=universityName;
        this.rollNumber=rollNumber; 
        this.Grade=Grade; 
        this.totalnoOfStudent=totalnoOfStudent;
        totalnoOfStudent++;
    } 
    public static int totalnoOfStudentinUniversity(){
        return totalnoOfStudent;
    }
    public void displayDetails(){
        if(this instanceof UniversityManagment){
            System.out.println("The name of the University is "+universityName);
            System.out.println("The roll Number of the Student is "+rollNumber);
            System.out.println("The Grade of the Student is "+Grade);
            
        } 
        else{
            System.out.println("Instance not exist");
        }
    } 
    public static void main(String[] args) {
        UniversityManagment um=new UniversityManagment("RGPV", "0111CS211093", 'A');
        UniversityManagment um2=new UniversityManagment("RGPV", "0111IT211093", 'B');
        UniversityManagment um3=new UniversityManagment("JNTU","0111AL211093",'C');
        um.displayDetails();
        um2.displayDetails();
        um3.displayDetails();
        System.out.println("The total number of student is "+um.totalnoOfStudentinUniversity());
        //um2.totalnoOfStudentinUniversity();


        
    }


    
    



    
}

/*
 * Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

 */