import java.util.*;
import java.io.*;
import java.util.Random;
class number_game{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     Random r=new Random();
     int n=r.nextInt(100);
     System.out.println(n);
     int number_of_times=5;
     int guesses=0;
     int x=1;
     while(x<=number_of_times){
     System.out.println("Hii user! Can u Guess the number generated?");
     int guess=sc.nextInt();
     if(guess==n){
        System.out.println("Great..U r correct");
        System.out.println("You can now exit by typing no");
        break;
     }
     else if(guess<n){
        System.out.println("Ouch...Guess is too low");
     }
     else if(guess>n){
        System.out.println("Ouch...Guess is too high");
     }
     x++;
     guesses++;
    }
    int round_taken=1;
    System.out.println("your chance for guess round over");
    System.out.println("Do you wish to use additional round");
    String add_round=sc.next();
    String check="yes";
    if(add_round.equalsIgnoreCase(check)){

    int tot_round_allowed=3;
    int m=1;
     
    while(m<=tot_round_allowed){
    
    System.out.println("Do you wish to continue? enter yes or no");
    
    String wish=sc.next();
   
    //System.out.println(wish);
    if(wish.equalsIgnoreCase(check)){
    System.out.println("Here is your next round");
        round_taken++;
        int y=1;
    while(y<=5){
     System.out.println("Hii user! Can u Guess the number generated?");
     int guess=sc.nextInt();
     if(guess==n){
        System.out.println("Great..U r correct");
        break;
     }
     else if(guess<n){
        System.out.println("Ouch...Guess is too low");
     }
     else if(guess>n){
        System.out.println("Ouch...Guess is too high");
     }
     y++;
     guesses++;
    }
    }
    else{
        System.out.println("Thakyou!!");
    
    }
    m++;
    }
}
else{
    System.out.println("round_taken "+round_taken);
    
}
System.out.println("guesses taken "+guesses);
if(guesses<5){
    System.out.println("your score is 100");
    System.out.println("you are really great");

}
else if( guesses>=5 && guesses<10){
    System.out.println("your score is 75");
    System.out.println("Good");
}
else if( guesses>=10 && guesses<15){
    System.out.println("your score is 50");
    System.out.println("Keep it up");
}
else{
    System.out.println("your score is 35");
    System.out.println("Aim for good score and you can");
}
System.out.println("Game over....");
    }
}
