public class Surgeon extends HealthProfessional {
    private String Surgeon;

    public Surgeon(){
        super();
        this.Surgeon="General Surgery";
    }

    public Surgeon(int id,String name,String department,String Surgeon){
        super(id,name,department);
        this.Surgeon=Surgeon;
    }
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("Surgeon Type"+Surgeon);
    }

}
