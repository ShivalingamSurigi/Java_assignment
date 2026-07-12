package OOPs;

public class Patient {
    int PatientID;
    String PatientName;
    String Disease;
    void patient1(int PatientID,String PatientName,String Disease)
    {
        IO.println("Patient ID:"+PatientID);
        IO.println("Patient Name:"+PatientName);
        IO.println("Disease:"+Disease);
        IO.println();
    }
    void patient2(int PatientID,String PatientName,String Disease)
    {
        IO.println("Patient ID:"+PatientID);
        IO.println("Patient Name:"+PatientName);
        IO.println("Disease:"+Disease);
        IO.println();
    }
    void patient3(int PatientID,String PatientName,String Disease)
    {
        IO.println("Patient ID:"+PatientID);
        IO.println("Patient Name:"+PatientName);
        IO.println("Disease:"+Disease);
    }
    static void main(String[] args) {
        Patient p=new Patient();
        p.patient1(101,"UdayKumar","Lovmophiya");
        p.patient2(201,"Manideep","Polio");
        p.patient3(505,"Sai reddy","Maleria");
    }
}
