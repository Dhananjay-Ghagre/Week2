import java.util.ArrayList;
import java.util.List;

// Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method for billing
    public abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);

    List<String> viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int numberOfDays;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, double roomChargePerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.numberOfDays = numberOfDays;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }
}

// Main class
public class HospitalManagementSystem {

    // Method to process patients
    public static void processPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical History: " + record.viewRecords());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        // Add an InPatient
        InPatient inPatient = new InPatient("P101", "Alice", 30, 2000.0, 5);
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-surgery recovery");
        patients.add(inPatient);

        // Add an OutPatient
        OutPatient outPatient = new OutPatient("P102", "Bob", 45, 500.0);
        outPatient.addRecord("Consulted for fever");
        patients.add(outPatient);

        // Process patients
        processPatients(patients);
    }
}
