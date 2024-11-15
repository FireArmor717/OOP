public class GeneralPractitioner extends HealthProfessional {
    private String ConsultationType;
    
    public GeneralPractitioner(){
        super();
        this.ConsultationType="General Consultation";
    }

    public GeneralPractitioner(int id,String name,String department,String ConsultationType){
        super(id,name,department);
        this.ConsultationType=ConsultationType;
    }

    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("Consultation Type"+ConsultationType);
    }
}
