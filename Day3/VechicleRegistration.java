

public class VechicleRegistration {
    static int registrationFee;
    String ownerName; 
    String vechicleType; 
     final String registrationNumber;
     VechicleRegistration(int registrationFee,String ownerName,String vechicleType,String registrationNumber){
        this.registrationFee=registrationFee; 
        this.ownerName=ownerName; 
        this.vechicleType=vechicleType;
        this.registrationNumber=registrationNumber;
     }
     public  void updateregistrationFee(int newFee){ 
        this.registrationFee=newFee;


     } 
     public void displayDetails(){
        if(this instanceof VechicleRegistration){
            System.out.println("The registration fee of the vechile is "+registrationFee);
            System.out.println("The owner name of vechile is "+ownerName);
            System.out.println("The vechileType is "+vechicleType); 
            System.out.println("The registration number of the Vechile is "+registrationNumber);

        } 
        else{
            System.out.println("Instance not exist");
        }
     }
     public static void main(String[] args) {
        VechicleRegistration vr=new VechicleRegistration(200, "Nishant", "4 Wheeler","BR31XC3362" );
        //vr.displayDetails(); 
        vr.updateregistrationFee(400);
      //  VechicleRegistration vr2=new VechicleRegistration(400, "Pankj", "4 wheeler", "BR31XC3362");
      vr.displayDetails();

     }




    
    

}
/*
 * 
 * 
 * Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details.

 */
