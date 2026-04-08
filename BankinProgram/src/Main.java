import java.util.Scanner;


public class Main {

    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //JAVA BANKING PROGRAM


        double balance=0;
        boolean isRunning=true;
        int choice;

        while(isRunning){
            //DISPLAY MENU
            System.out.println("***********************");
            System.out.println("Banking Program");
            System.out.println("***********************");
            System.out.println("1: Show Balance ");
            System.out.println("2: Deposit ");
            System.out.println("3: Withdraw ");
            System.out.println("4: Exit ");
            System.out.println("***********************");

            //GET AND PROCESS USER CHOICES

            System.out.print("Enter your choice (1-4) : ");
            choice=scanner.nextInt();
            System.out.println("***********************");

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance +=deposit() ;
                case 3 -> balance -=withdraw(balance);
                case 4 -> isRunning=false;
                default -> System.out.println("-Invalid choice-");
            }

        }
        //EXIT MESSAGE
        System.out.println("**************************************************");
        System.out.println(" Thank You For Using Our Bank ! Have A Nice Day ! ");
        System.out.println("**************************************************");

        scanner.close();
    }
    //showBalance()
    static void showBalance(double balance){
        System.out.println("--------------------------------");
        System.out.printf("Your Balance is : $%.2f\n",balance);
        System.out.println("--------------------------------");
    }
    //deposit()
    static double deposit(){

        double amount;
        System.out.println("-------------------------------------");
        System.out.print("Enter the amount you want to DEPOSIT : ");
        amount= scanner.nextDouble();

        if (amount<0){
            System.out.println("Amount Can`t be negative ! ");
            System.out.println("-------------------------------------");
            return 0;
        }else {
            System.out.println("-------------------------------------");
            return amount;
        }
    }
    //withdraw()
    static double withdraw(double balance){

        double amount;
        System.out.println("-----------------------------");
        System.out.print("Enter amount to be withdrawn : ");
        amount = scanner.nextDouble();

        if (amount>balance){
            System.out.println("_____________________");
            System.out.println(" INSUFFICIENT FUNDS ");
            System.out.println("---------------------");
            return 0;
        }else if(amount<0){
            System.out.println("-----------------------");
            System.out.println("amount cant be negative");
            System.out.println("-----------------------");
            return 0;
        }else{
            System.out.println("-----------------------------");
            return amount;
        }
    }
}