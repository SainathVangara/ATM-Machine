package atm;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();

        int atmnumber = 12345;
        int atmpin = 2003;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To ATM Machine !!!");
        System.out.println("Enter ATM Number : ");
        int atmNumber = sc.nextInt();
        System.out.println("Enter Pin");
        int pin =sc.nextInt();
        if((atmnumber == atmNumber) && (atmpin == pin)){
            while(true){
                System.out.println("1.View Available balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View the mini statement\n5.Exit ");
                System.out.println("Enter choice : ");
                int ch = sc.nextInt();
                if(ch == 1){
                    op.viewBalance();

                }
                else if(ch == 2){
                    System.out.println("Enter Amount to be withdraw :");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);


                }
                else if(ch == 3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch == 4){
                    op.viewMiniStatement();

                }
                else if(ch == 5){
                    System.out.println("Collect your ATM Card\nThank you for using our ATM Machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect atm number or pin");
            System.exit(0);
        }

    }
}
