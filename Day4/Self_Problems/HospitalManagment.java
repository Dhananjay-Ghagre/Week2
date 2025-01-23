 class Patient { // Patient class for the Hospital
    private String patientName; // Patient class with patient name
    Patient(String patientName){// Patient class with patient name
        this.patientName=patientName;
        System.out.println("The patient with name "+this.patientName+" is admited in the Hospital");
    }
    public String getpatientName(){// Patient class with patient name
        return this.patientName;
    }
    
    
}
class Doctor{// Doctor class for the Hospital for the consultation
    private String doctorName;  
    Doctor(String doctorName){// Doctor class for the Hospital for the consultation
        this.doctorName=doctorName;
    }
    public String doctorName(){// Doctor class for the Hospital for the consultation
        return this.doctorName;
    }
    public void addconsultent(Patient p){
        System.out.println("The patient having name "+p.getpatientName()+" is consulted with the "+this.doctorName);
    }
} 
class HospitalManagment{ // Hospital class containing Doctor and Patient classes
    public static void main(String[] args) {// Hospital class containing Doctor and Patient classes
        
    
    Doctor d=new Doctor("DR.Sehgal"); // Doctor class for the Hospital for the consultation
    Doctor d2=new Doctor("Vaid Imran"); 
    Patient p=new Patient("Nishant"); // Patient class for the Hospital
    Patient p2=new Patient("Pankaj"); 
    d.addconsultent(p); // Doctor class for the Hospital for the consultation
    d2.addconsultent(p2);// Doctor class for the Hospital for the consultation
    }



}
/*
 *  3: Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.

 */