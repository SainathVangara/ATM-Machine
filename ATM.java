package atm;
public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    //default constructor
    public ATM(){
    }
    // getter setter for every variable
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getDepositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }
    public double getWithsrawAmount(){
        return withdrawAmount;
    }
    public void setwithdrawAmount (double withdrawAmount){
        this.withdrawAmount = withdrawAmount;
    }

}
