public class Appointment {
    public static Object phone;
    private String PatientName;
    private String PatientMobileNum;
    private HealthProfessional healthProfessional;
    private String TimeSlot;

    public Appointment() {
    }

    public Appointment(String PatientMobileNum, String PatientName, String TimeSlot, HealthProfessional healthProfessional) {
        this.PatientMobileNum = PatientMobileNum;
        this.PatientName = PatientName;
        this.TimeSlot = TimeSlot;
        this.healthProfessional = healthProfessional;
    }

    public void PrintDetails(){
        System.out.println("Patient Name: "+PatientName);
        System.out.println("Patient Moblie Num: "+PatientMobileNum);
        if(healthProfessional!=null){
            System.out.println("Health Professional Details: "+healthProfessional);
        }else{
            System.out.println("No Health Professional were assigned.");
        }    
        System.out.println("Time slot"+TimeSlot);
    }
}
