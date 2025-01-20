
class StudentsDetail{
    String name; 
    String rollNo; 
    int marks[];

 StudentsDetail(String name,String rollNo,int marks[]){
    this.name=name; 
    this.rollNo=rollNo;
    this.marks=marks;
 }
 public static String gradeofStudent(int marks[]){
    int sum=0; 
    double value=0;
    for(int  marksValue:marks) 
    sum+=marksValue;
    value=(double)(sum/100);
    if(value>=90){
        return "Excellent";
    } 
    else if(value>=70&&value<=90){
        return "Good";
    }
    else{
        return "Normal";
    }
 }
 public void studentDetail(){
    System.out.println("The name of the Student is "+name); 
    System.out.println("The rollNo of the Studnet is "+rollNo); 
    for(int i=0;i<5;i++){
        System.out.println("The marks of the student in subject "+(i+1)+ marks[i]); 
        
    }
    System.out.println("The grade of the studnent is "+gradeofStudent(marks));
 }
 public static void main(String[] args) {
    int newmarks[]={60,70,80,80,100};
   // StudentDetail sd=new  StudentDetail("Dhananjay","0111IT211037",marks[]); 
   StudentsDetail sd=new StudentsDetail("Dhananjay","0111IT211037",newmarks); 
    
   sd.studentDetail();
 }
}