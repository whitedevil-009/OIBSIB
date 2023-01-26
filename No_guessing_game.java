import java.util.Random;
import java.util.Scanner;


class Guessing_game{
    public int number;
    public int inputnumber;
    public int no_of_guess=0;
    public int getNo_of_guess() {
        return no_of_guess;
    }
    public void setNo_of_guess(int no_of_guess) {
        this.no_of_guess = no_of_guess;
    }
    Guessing_game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);

    }
    void userinput(){
        System.out.println("guess the number");
        Scanner sc= new Scanner(System.in);
        inputnumber= sc.nextInt();
        

    }

    boolean correctguess(){
        no_of_guess++;
        if(inputnumber==number){
            System.out.format("you gussed right no %d \n you successfully gussed the no in %d attempts\n",number,no_of_guess);
            return true;
            
        }else if(inputnumber<number){
            System.out.println("guessed number is small than generated no.");
        }else if(inputnumber>number){
            System.out.println("guessed number is greater than generated no.");
        }
        return false;
        


    }
    

}


public class No_guessing_game {
    public static void main(String[] args){

        Guessing_game g= new Guessing_game();
        boolean a=false;
        while(!a){
        g.userinput();
        a= g.correctguess();
        System.out.println(a);
        }



    }

    
}
