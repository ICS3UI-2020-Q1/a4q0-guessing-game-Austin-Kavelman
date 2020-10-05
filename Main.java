import java.util.Scanner;
import java.util.Random;
/**
 * Number guessing game
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //creating the random generator
    Random rand = new Random();

    //create a random number
    int randNum = rand.nextInt(100) + 1;

    //declare the guess variable
    int guess;
    //game loop
    do{
        System.out.println("Please Guess a number between 1 and 100 ");
        guess = input.nextInt();
        //is it too high or too low
        if(guess > randNum){
        System.out.println("Too high");
        } else if (guess < randNum){
          System.out.println("Too low ");
        } else{
          System.out.println("Congratulations! You win");
        }
    }while(guess != randNum);





  }
}
