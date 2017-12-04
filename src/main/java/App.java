import java.io.Console;

public class App{
    public static void main(String[] args){
        Console myConsole = System.console();

                    //Innitialize a new hangman class to access its objects

        Hangman hangMan = new Hangman();

                    /*
                    A while-loop to keep the guess letter  prompter running until either the player has failed seven times or all the asterisks have been successfully replaced by their correct letters
                    */

        while (hangMan.getCount() < 7 && hangMan.getAsterisk().contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(hangMan.getAsterisk());
			String guess = myConsole.readLine();
			hangMan.hang(guess);
		}
    }
}
