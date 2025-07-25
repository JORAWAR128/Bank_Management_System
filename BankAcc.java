import java.util.*;
public class Project{
    public static void main(String [] args){
        String Hname , Contact , Email , Balance , ano , IFSC;
        BankAcc selectedacc = null;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----------------Welcome to Customer Service------------");
            System.out.println("How can we help you ?");
            System.out.print("To create new Account -> Enter 1\n"+
                              "To Log in to Existing Account -> Enter 2\n" +
                             "To Close the program -> Enter 3\n");
            int option1 = sc.nextInt();
            sc.nextLine();
            if(option1 == 1){
                System.out.print("------Welcome to HariBhari Bank------\n"+
                "Please provide the following details to open new account\n");
                System.out.println("Account Holder Name : ");
                Hname = sc.nextLine();
                System.out.println("Contact : ");
                Contact = sc.nextLine();
                System.out.println("Email : ");
                Email = sc.nextLine();
                System.out.println("Balance : ");
                Balance = sc.nextLine();
                System.out.println("Enter your area ! Laxmipura = 1 , Waghodia = 2 , Gorwa = 3 , Mandvi = 4");
                int n = sc.nextInt();
         BankAcc acc = new BankAcc();
                acc.Hname = Hname;
                acc.Contact = Contact;
                acc.Email = Email;
                acc.Balance = Balance;
                acc.Bankname = "HariBhari Bank";
                acc.generateAccno();
                acc.IFSCcode(n);
                BankAcc.bankacc[BankAcc.index++] = acc;
                System.out.println("Bank Account Created Succesfully"); 
            }
        else if(option1 == 2){
            System.out.println("------LOGIN INFO------");
             while(selectedacc == null){
            System.out.println("Enter account number to verify!");
             ano = sc.nextLine().toUpperCase();
        for(BankAcc acc : BankAcc.bankacc){
            if(acc.getAccno().equals(ano)){
                selectedacc = acc;
                System.out.println("Account number matched Sucessfully");
                break;
            }
        }
        if(selectedacc == null){
            System.out.println("Invalid Account number , please try again");
        }
        }
         System.out.println("How may I help you ? ");
         System.out.print("To Credit Amount -> Enter 1\n"+
                           "To Debit Amount -> Enter 2\n"+
                           "To View Bank Balance -> Enter 3\n"+
                           "To View Account Details -> Enter 4\n"+
                           "To go back to previous menu -> Enter 5\n"+
                           "To close the program -> Enter 6\n");
        int option2 = sc.nextInt();
        sc.nextLine();
        switch(option2){
            case 1:
                selectedacc.creditbal();
                break;
            case 2:
                selectedacc.debitbal();
                break;
            case 3:
                selectedacc.ViewBal();
                break;
            case 4:
                selectedacc.ViewAccDetails();
                break;
            case 5:
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Incorrect Number !!");
        }
        }
        else if(option1 == 3){
            sc.close();
            System.exit(0);
        }
        else{
            System.out.println("Incorrect Number , Enter only 1/2/3");
        }
        }
    }
}
class BankAcc{
    Scanner sc = new Scanner(System.in);
    String Hname;
    String Bankname;
    String Email;
    String Contact;
    String IFSC;
    String Balance;
    String ano;
    static BankAcc CurrentBankAcc;
    static BankAcc [] bankacc = new BankAcc[10];
    static int index = 0;
    public String getAccno() {
    return ano;
}
    public void generateAccno(){
        this.Hname = this.Hname.toUpperCase();
        Random rand = new Random();
        int num = 1000+rand.nextInt(9000);
        this.ano = this.Hname+num;
        System.out.println("Account number generated successfully.");
        System.out.println("Your Account number is ->"+ano);
    }
    public void creditbal(){
            System.out.println("Enter Amount to credit .");
           int cbal = sc.nextInt();
            sc.nextLine();
              int bal = Integer.parseInt(this.Balance);
            bal = bal + cbal;
            this.Balance = Integer.toString(bal);
            System.out.println("Amount credited to your bank account successfully .");
            System.out.println("New balance : "+ this.Balance);
    }
    public void debitbal(){      
    System.out.println("Enter amount to debit.");
    int bal = Integer.parseInt(this.Balance);
    int dbal = sc.nextInt();
    sc.nextLine();
    if(dbal > bal){
        System.out.println("Insufficient balance to debit.Enter appropriate amount again");
    }
    else if(dbal < bal){
        bal = bal - dbal;
        this.Balance  = Integer.toString(bal);
        System.out.println("Amount Debited Succesfully");
        System.out.println("New Balance : "+this.Balance);
    }
    }
public void ViewBal(){
     System.out.println("Your current Bank Balance is : "+this.Balance); 
}
public void ViewAccDetails(){
     System.out.print("ACCOUNT DETAILS\n"+
                        "HOLDER NAME : "+this.Hname+"\n"+
                       "Email : "+this.Email+"\n"+
                       "Contact : "+this.Contact+"\n"+
                        "Bank Name : "+this.Bankname+"\n"+
                        "IFSC Code : "+this.IFSC+"\n"+
                        "Acc no : "+this.ano+"\n"+
                        "Balance : "+this.Balance+"\n"); 
}
public void IFSCcode(int n){
    String s ;
     Random randnum = new Random();
        int number = randnum.nextInt(9999);
    if(n == 1){
        s = "LAXMIPURA";
    }
     else if(n == 2){
        s = "WAGHODIA";
    }
       else if(n == 3){
        s = "GORWA";
    }
      else if(n == 4){
        s = "MANDVI";
    }
    else{
        System.out.println("Sorry we dont have any branch at the provide location . ");
        return;
    }
    
     this.IFSC = s+number;
     sc.close();
}
}
