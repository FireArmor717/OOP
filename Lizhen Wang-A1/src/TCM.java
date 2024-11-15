public class TCM extends HealthProfessional {
    private String TCM;

    public TCM(){
        super();
        this.TCM="Traditonal Chinese Medicine";
    }

    public TCM(int id,String name,String department,String TCM){
        super(id,name,department);
        this.TCM=TCM;
    }
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("Traditional Chinese Medicine Type: "+TCM);
    }

}
