import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        GeneralPractitioner gp1=new GeneralPractitioner(1,"Jun","GP Department","Check");
        GeneralPractitioner gp2=new GeneralPractitioner(2,"Xiao","GP Department","Obeservation");
        TCM c1=new TCM(3,"Zhen","TCM Department","Medicine and Surgery");

        ArrayList<Appointment>appts=new ArrayList<>();
        appts.add(new Appointment("18539251669","Xiang","09:33",gp1));
        appts.add(new Appointment("17722223838","Atlas","18:18",gp2));
        appts.add(new Appointment("13322221111","Lava","10:10",c1));

        System.out.println("Current Appointments: ");
        for(Appointment a:appts){
            a.PrintDetails();
            System.out.println("--------------------");
        }

        String Cancel="82070606";
        boolean removing=false;

        for(int i = 0; i < appts.size(); i++) {
            if(appts.get(i).PatientMobileNum.equals(Cancel)){
                appts.remove(i);
                removing=true;
                System.out.println("Appointment for: "+Cancel+"has been canceled.");
                break;
            }
        }
        if(!removing){
            System.out.println("There is no appointment for: "+Cancel);
        }

        System.out.println("Updated Appointments:");
        for(Appointment a:appts){
            a.PrintDetails();
            System.out.println("--------------------");
        }
    }
}
