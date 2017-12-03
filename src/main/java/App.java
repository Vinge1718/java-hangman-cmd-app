import java.io.Console;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner keyBoardInput = new Scanner(System.in);
        Console myConsole = System.console();
        Hangman hangMan = new Hangman();

        while (hangMan.getCount() < 7 && hangMan.getAsterisk().contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(hangMan.getAsterisk());
			String guess = myConsole.readLine();
			hangMan.hang(guess);
		}
		keyBoardInput.close();
    }
}
