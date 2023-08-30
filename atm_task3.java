import java.util.Scanner;  

public class atm_task3  
{    
    public static void main(String args[] )  
    {   
        int main_bal = 1200000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Here is your ATM...");  
            System.out.println("Type 1 for Withdraw, 2 for Deposit.. 3 for Check Balance and 4 for EXIT ");  
            System.out.print("Please enter your choice to perform the operation you want...");  
            int ch = sc.nextInt();  
            switch(ch)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
        withdraw = sc.nextInt();  
        if(main_bal >= withdraw)  
        {  
            main_bal = main_bal - withdraw;  
            System.out.println("Collect your money..");  
        }  
        else  
        {  
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter the amount you want to deposit");  
        deposit = sc.nextInt();  
        main_bal = main_bal + deposit;  
        System.out.println("Successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:   
        System.out.println("Your main balance is : "+main_bal);  
        System.out.println("");  
        break;  
   
                case 4:  
        System.exit(0);  
            }  
        }  
    }  
}  
