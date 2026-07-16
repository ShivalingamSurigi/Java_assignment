package OOPs.Encapsulation;

public class Patient {
    private int PatientID;
    private String PatientName;
    private int Age;
    private String Disease;
    public void setPatientdetails(int PatientID,String PatientName,int Age,String Disease)
    {
        this.PatientID=PatientID;
        this.PatientName=PatientName;
        this.Age=Age;
        this.Disease=Disease;
        if(Age>0)
        {
            IO.println("Patient ID:"+PatientID);
            IO.println("Patient Name:"+PatientName);
            IO.println("Age:"+Age);
            IO.println("Disease:"+Disease);
        }
    }

    static void main(String[] args) {
        Patient p=new Patient();
        p.setPatientdetails(1001,"Udaykumar",20,"Malaria");
    }
}
