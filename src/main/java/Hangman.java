import java.io.Console;
import java.util.List;
import java.util.ArrayList;


public class Hangman{

                // VARIABLES
                //-----------Words to be used during the game

    private static String[] words = {"weather", "program", "computer", "animals", "beverage", "entertaiment" };

                /* - Selecting a word from the array of words above.
                -- 1. Generate a random number and multiply by the words-array size/length and initialize the result as a primitive integer.
                -- 2. Step one gives you a random word from the words array and assigns it a variable "word"

                -- simply put --
                int randomWordPosition = (int) (Math.random() * words.length);
                word = words[randomWordPosition];
                */

    private static String word = words[(int) (Math.random() * words.length)];

                /* - Since characters in java strings are immutable (can't reassign/replace with new values). We create a new string of astericks
                -- 1. Get the length of the random word selected.
                -- 2. create a new string whose length is based on the randomly selected word by creating new characters from the newly parsed string object.
                */

    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");

                //Keeps track of how many tries the user has made and determines which hangman image gets displayed.

    private static int count = 0;

                /* HANG FUNCTION
                -- 1. Introduce an variable to hold the correctly guessed letter correctGuesses
                -- 2. For loop that compared the guessed characters with each character in the random word
                */

    public static void hang(String guess){
        String correctGuesses = "";

        for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				correctGuesses += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				correctGuesses += word.charAt(i);
			} else {
				correctGuesses += "*";
			}
		}



        if (asterisk.equals(correctGuesses)) {
			count++;
			hangmanImage();
		} else {
			asterisk = correctGuesses;
		}
		if (asterisk.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}



                //implementing getter methods for the variables

    public String getWord(){
        return word;
    }


    public String[] getWords(){
        return words;
    }

    public int getCount(){
        return count;
    }

    public String getAsterisk(){
        return asterisk;
    }

                //HANGMAN GALLOWS PROGRESSION

    public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
			System.out.println("   |           |");
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}
