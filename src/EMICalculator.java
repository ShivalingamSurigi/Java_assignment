public class EMICalculator {
    static int calculateEMI(int loanAmount,int years)
    {
        return loanAmount/years;
    }
    static void main(String[] args) {
        int calculator=calculateEMI(500000,5);
                IO.println("Yearly EMI:"+calculator);
    }
}
