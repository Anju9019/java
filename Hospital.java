/*hospital.checkup(patientname,age,mobile,email,sickness)
Doctor.teatment(patientname,age,sichness)---
Nurse.assist(patientname*/

class Hospital{
public static void checkUp(String patientName,int age,long phoneNumber,String email,String Disease)
{
System.out.println("started with checkUp");
Doctor.treatment(patientName,age,Disease);
Nurse.assit(patientName);
System.out.println("checkUp done");
}
  }