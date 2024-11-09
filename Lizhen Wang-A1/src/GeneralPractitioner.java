public class GeneralPractitioner extends HealthProfessional {
    private String ConsulationType;
    
    public GeneralPractitioner(){
        super();
        this.ConsulationType="General Consultation";
    }

    public GeneralPractitioner(int id,String name,String department,String ConsulationType){
        super(id,name,department);
        this.ConsulationType=ConsulationType;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Consultation Type"+ConsulationType);
    }
}
