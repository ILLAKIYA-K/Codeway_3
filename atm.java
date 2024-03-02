import java.util.Scanner;


 class Atm {
   
    float balance = 0.0f;
    
    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("Amount withdraw successfully");
        }
    }
      
      float getBalance() {
         return balance;
     }
    
        
   
}

class SavingsAccount extends Atm {
   
   String name;
   private long accNo;
   private String email;
  
   SavingsAccount(String name){
       this.name = name;
   }
   
   public void setAccNo(long accNo){
       this.accNo = accNo;
   }
   public long getAccNo(){
       return accNo;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public String getEmail(){
       return email;
   }
  
   
}


class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Username : ");
        String name = input.next();
        System.out.println("Enter the EmailId : ");
        SavingsAccount account = new SavingsAccount(name);
        account.setEmail(input.next()); 

       
        System.out.println("-------+-------+-----------+---------+--------"); 
        System.out.println("Customer name: " + account.name); 
        System.out.println("Customer email: " + account.getEmail()); 
        System.out.println("-------+-------+-----------+---------+--------"); 
        System.out.println("If Deposit: Enter 1 ");
        System.out.println("If withdraw: Enter 2 ");
        System.out.println("If checkbalance: Enter 3 ");
        System.out.println("-------+-------+-----------+---------+--------"); 
        for(int i=0; i<3; i++){
            System.out.println("Enter the options");
            int options = input.nextInt();
        if(options == 1){
            System.out.println("Enter the amount to be deposited : ");
            account.deposit(input.nextInt());
            
            System.out.println("The amount is deposited successfully");
            System.out.println("-------+-------+-----------+---------+----"); 
        }

        else if(options == 2){
            System.out.println("Enter the amount to be withdraw : ");
            account.withdraw(input.nextInt());
            System.out.println("-------+-------+-----------+---------+----"); 
        }
        
        else if(options == 3){
            
            System.out.println("The Available balance is");
            System.out.println(  account.getBalance());
            System.out.println("-------+-------+-----------+---------+----"); 
        }
    }

       
        
        

        
        input.close();
    } 
}