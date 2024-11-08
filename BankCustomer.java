
public class BankCustomer {
    
    private int acno;       
    private String atype;   
    private double amt;     

    
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    
    public int getAcno() {
        return acno;
    }

    public String getAtype() {
        return atype;
    }

    public double getAmt() {
        return amt;
    }

    
    public void setAmt(double amt) {
        this.amt = amt;
    }

    
    public void displayDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    
    public static void main(String[] args) {
       
        BankCustomer customer = new BankCustomer(12345, "Savings", 5000.0);

        
        customer.displayDetails();
    }
}
